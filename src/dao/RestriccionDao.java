package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Restriccion;
import models.TipoEstado;

public class RestriccionDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private String nombreRestriccion;

    public RestriccionDao() {
        db = new Db();
    }
    
    public List<Restriccion> listadoRestricciones() {
        List<Restriccion> listadoRestricciones = new ArrayList<Restriccion>();
        String sql = "SELECT * FROM restriccion;";
        System.out.println(sql);
        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("idrestriccion");
                nombreRestriccion = rs.getString("restriccion");
                Restriccion restriccion = new Restriccion(id, nombreRestriccion);
                listadoRestricciones.add(restriccion);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRestricciones;
    }
    
}
