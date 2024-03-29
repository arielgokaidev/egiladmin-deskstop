package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Residente;

public class ResidenteDao {
    
    private Db db;
    private Connection conexion;
    
    private String rut;
    private int idTipoResidente;
    private String nombres;
    private String apellidos;
    private String correo;
    private String numeroDepartamento;
    
    public ResidenteDao() {
        db = new Db();
    }
    
    public List<Residente> listadoResidentes() {
        List<Residente> listadoResidentes = new ArrayList<Residente>();
        String sql = "SELECT * FROM residente;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                rut = rs.getString("rut");
                idTipoResidente = rs.getInt("tiporesidente_idtiporesidente");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                correo = rs.getString("correo");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                Residente residente = new Residente(rut, idTipoResidente, nombres, apellidos, correo, numeroDepartamento);
                listadoResidentes.add(residente);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoResidentes;
    }
    
    public List<Residente> listadoResidentesDepartamento(String departamento) {
        List<Residente> listadoResidentes = new ArrayList<Residente>();
        String sql = "SELECT * FROM residente WHERE departamento_numerodpto = '" + departamento + "';";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                rut = rs.getString("rut");
                idTipoResidente = rs.getInt("tiporesidente_idtiporesidente");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                correo = rs.getString("correo");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                Residente residente = new Residente(rut, idTipoResidente, nombres, apellidos, correo, numeroDepartamento);
                listadoResidentes.add(residente);
            }
            statement.close();
            db.desconectar();      
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoResidentes;
    }
    
}
