package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Estacionamiento;
import models.Residente;

public class EstacionamientoDao {
    
    private Db db;
    private Connection conexion;
    
    private int numero;
    private String numeroDepartamento;
    private int mt2;
    
    public EstacionamientoDao() {
        db = new Db();
    }
    
    public List<Estacionamiento> listadoEstacionamientos() {
        List<Estacionamiento> listadoEstacionamientos = new ArrayList<Estacionamiento>();
        String sql = "SELECT * FROM estacionamiento;";
        System.out.println(sql);
        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                numero = rs.getInt("numeroest");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                mt2 = rs.getInt("totalmts2");
                Estacionamiento estacionamiento = new Estacionamiento(numero, numeroDepartamento, mt2);
                listadoEstacionamientos.add(estacionamiento);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoEstacionamientos;
    }
    
}
