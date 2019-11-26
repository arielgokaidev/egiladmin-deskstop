package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.EstacionamientoVisita;

public class EstacionamientoVisitaDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private int numero;
    private String estado;
    private int valor;
    
    public EstacionamientoVisitaDao() {
        db = new Db();
    }
    
    public List<EstacionamientoVisita> listadoEstacionamientos() {
        List<EstacionamientoVisita> listadoEstacionamientos = new ArrayList<EstacionamientoVisita>();
        String sql = "SELECT * FROM estacionamientovisita;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("idestacionamientovisita");
                numero = rs.getInt("numero");
                estado = rs.getString("estado");
                valor = rs.getInt("valor");
                EstacionamientoVisita estacionamiento = new EstacionamientoVisita(id, numero, estado, valor);
                listadoEstacionamientos.add(estacionamiento);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoEstacionamientos;
    }
    
}
