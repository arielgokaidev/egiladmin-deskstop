package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Departamento;

public class DepartamentoDao {
    
    private Db db;
    private Connection conexion;
    
    private String numero;
    private String torre;
    private int mt2;
    
    public DepartamentoDao() {
	db = new Db();
    }
    
    public List<Departamento> listadoDepartamentos() {
        List<Departamento> listadoDepartamentos = new ArrayList<Departamento>();
        String sql = "SELECT * FROM departamento;";
        System.out.println(sql);
        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                numero = rs.getString("numerodpto");
                torre = rs.getString("torre");
                mt2 = rs.getInt("totalmts2");
                Departamento departamento = new Departamento(numero, torre, mt2);
                listadoDepartamentos.add(departamento);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoDepartamentos;
    }
    
}
