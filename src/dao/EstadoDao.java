package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstadoDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private String usuarioRut;
    private String numeroDepartamento;
    private int idTipoEstado;
    private String fecha;
    private String observacion;
    private int restriccion;

    public EstadoDao() {
        db = new Db();
    }
    
    public boolean ingresarEstado(String usuario, String departamento, int estado, String fecha, String observacion, String restriccion) {
        boolean insert = false;
        int result = 0;
        int id = maxRegistroEstado() + 1;
        System.out.println("id: " + id);
        String sql = "INSERT INTO estado "
                + "VALUES ("+id+", '"+usuario+"', '"+departamento+"', "+estado+", '"+fecha+"', '"+observacion+"', "
                + "'"+restriccion+"');";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            result = statement.executeUpdate(sql);
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        if (result == 1) {
            System.out.println("Insert OK");
            insert = true;
        }
        return insert;
    }
    
    public int maxRegistroEstado() {
        int id = 0;
        String sql = "SELECT MAX(idestado) as id FROM estado;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("id");
            }
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return id;
    }
    
}
