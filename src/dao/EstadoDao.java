package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Estado;

public class EstadoDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private String usuarioRut;
    private String numeroDepartamento;
    private int idTipoEstado;
    private String fecha;
    private String observacion;
    private String restriccion;
    private String nombreTipoEstado;

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
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return id;
    }
    
    public List<Estado> listadoEstadosDepartamento(String departamento) {
        List<Estado> listadoEstadosDepartamento = new ArrayList<Estado>();
        String sql = "SELECT * FROM estado INNER JOIN tipoestado "
                + "ON tipoestado.idtipoestado = estado.tipoestado_idtipoestado "
                + "WHERE departamento_numerodpto = '"+departamento+"' "
                + "ORDER BY fechaestado DESC;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fecha = limpiarFecha(rs.getString("fechaestado"));
                observacion = rs.getString("observacion");
                restriccion = rs.getString("restriccion");
                nombreTipoEstado = rs.getString("estado");
                Estado estado = new Estado(numeroDepartamento, fecha, observacion, restriccion, nombreTipoEstado);
                listadoEstadosDepartamento.add(estado);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoEstadosDepartamento;
    }
    
    public List<Estado> listadoEstadosDepartamentos() {
        List<Estado> listadoEstadosDepartamento = new ArrayList<Estado>();
        String sql = "SELECT * FROM tipoestado INNER JOIN "
                + "(SELECT * FROM estado GROUP BY departamento_numerodpto DESC) AS a "
                + "ON a.tipoestado_idtipoestado = tipoestado.idtipoestado "
                + "ORDER BY departamento_numerodpto";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fecha = limpiarFecha(rs.getString("fechaestado"));
                observacion = rs.getString("observacion");
                restriccion = rs.getString("restriccion");
                nombreTipoEstado = rs.getString("estado");
                Estado estado = new Estado(numeroDepartamento, fecha, observacion, restriccion, nombreTipoEstado);
                listadoEstadosDepartamento.add(estado);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoEstadosDepartamento;
    }
    
    public String limpiarFecha(String fecha) {
        if (fecha != null) {
            String[] partes = fecha.split("\\.");
            return partes[0];
        } else {
            fecha = "-";
            return fecha;
        }
    }
    
    public boolean revisarRestriccion(String departamento) {
        boolean restriccion = false;
        String resultado = "";
        String sql = "SELECT restriccion FROM estado WHERE fechaestado = "
                + "(SELECT MAX(fechaestado) FROM estado WHERE departamento_numerodpto = '"+departamento+"');";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                resultado = rs.getString("restriccion");
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Restricción: " + resultado);
        if (!resultado.isEmpty() && resultado.equals("Restriccion uso espacios comunes")) {
            restriccion = true;
        }
        return restriccion;
    }
    
}
