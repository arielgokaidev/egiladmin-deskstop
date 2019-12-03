package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.TipoEstado;

public class TipoEstadoDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private String nombreEstado;

    public TipoEstadoDao() {
        db = new Db();
    }
    
    public List<TipoEstado> listadoTipoEstados() {
        List<TipoEstado> listadoTipoEstados = new ArrayList<TipoEstado>();
        String sql = "SELECT * FROM tipoestado;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("idtipoestado");
                nombreEstado = rs.getString("estado");
                TipoEstado estado = new TipoEstado(id, nombreEstado);
                listadoTipoEstados.add(estado);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoTipoEstados;
    }
    
}
