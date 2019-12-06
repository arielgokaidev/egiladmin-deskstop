package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Reserva;

public class ReservaDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private String residenteRut;
    private String numeroDepartamento;
    private String usuarioRut;
    private String fecha;
    private int valorTurno;
    private String turno;
    private String nombres;
    private String apellidos;
    
    public ReservaDao() {
        db = new Db();
    }
    
    public boolean ingresarReserva(String rut, String departamento, String usuario, String fecha, int valorTurno, String turno) {
        boolean insert = false;
        int result = 0;
        int id = maxRegistroReserva() + 1;
        System.out.println("id: " + id);
        String sql = "INSERT INTO reservasala "
                + "VALUES ("+id+", '"+rut+"', '"+departamento+"', '"+usuario+"', '"+fecha+"', "+valorTurno+", "
                + "'"+turno+"');";
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
    
    public int maxRegistroReserva() {
        int id = 0;
        String sql = "SELECT MAX(idreservasala) as id FROM reservasala;";
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
    
    public List<Reserva> listadoRegistroReservas() {
        List<Reserva> listadoRegistroReservas = new ArrayList<>();
        String sql = "SELECT * FROM reservasala INNER JOIN residente ON residente.rut = reservasala.residente_rut "
                + "ORDER BY fechareserva, turno;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);   
            while (rs.next()) {
                id = rs.getInt("idreservasala");
                residenteRut = rs.getString("residente_rut");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fecha = rs.getString("fechareserva");
                valorTurno = rs.getInt("valorturno");
                turno = rs.getString("turno");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                Reserva reserva = new Reserva(id, residenteRut, numeroDepartamento, fecha, turno, nombres, apellidos);
                listadoRegistroReservas.add(reserva);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroReservas;
    }
    
    public List<Reserva> listadoRegistroReservasDepartamento(String departamento) {
        List<Reserva> listadoRegistroReservas = new ArrayList<>();
        String sql = "SELECT * FROM reservasala INNER JOIN residente ON residente.rut = reservasala.residente_rut "
                + "WHERE reservasala.departamento_numerodpto = '"+departamento+"' ORDER BY fechareserva, turno;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);   
            while (rs.next()) {
                id = rs.getInt("idreservasala");
                residenteRut = rs.getString("residente_rut");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fecha = rs.getString("fechareserva");
                valorTurno = rs.getInt("valorturno");
                turno = rs.getString("turno");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                Reserva reserva = new Reserva(id, residenteRut, numeroDepartamento, fecha, turno, nombres, apellidos);
                listadoRegistroReservas.add(reserva);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroReservas;
    }
    
    public List<Reserva> listadoRegistroFechas() {
        List<Reserva> listadoRegistroReservas = new ArrayList<>();
        String sql = "SELECT DISTINCT fechareserva FROM reservasala ORDER BY fechareserva;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);   
            while (rs.next()) {
                fecha = rs.getString("fechareserva");
                Reserva reserva = new Reserva(fecha);
                listadoRegistroReservas.add(reserva);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroReservas;
    }
    
    public List<Reserva> listadoRegistroReservasFecha(String fecha) {
        List<Reserva> listadoRegistroReservas = new ArrayList<>();
        String sql = "SELECT * FROM reservasala INNER JOIN residente ON residente.rut = reservasala.residente_rut "
                + "WHERE fechareserva = '"+fecha+"' ORDER BY turno;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);   
            while (rs.next()) {
                id = rs.getInt("idreservasala");
                residenteRut = rs.getString("residente_rut");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fecha = rs.getString("fechareserva");
                valorTurno = rs.getInt("valorturno");
                turno = rs.getString("turno");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                Reserva reserva = new Reserva(id, residenteRut, numeroDepartamento, fecha, turno, nombres, apellidos);
                listadoRegistroReservas.add(reserva);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroReservas;
    }
    
    public boolean revisarFecha(String fecha, String turno) {
        boolean disponible = true;
        int resultado = 0;
        String sql = "SELECT fechareserva, turno FROM reservasala "
                + "WHERE fechareserva = '"+fecha+"' AND turno = '"+turno+"';";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                resultado = rs.getRow();
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Resultado: " + resultado);
        if (resultado > 0) {
            disponible = false;
        }
        return disponible;
    }

    public boolean eliminarReserva(String fecha, String turno) {
        boolean delete = false;
        int result = 0;
        String sql = "DELETE FROM reservasala "
                + "WHERE fechareserva = '"+fecha+"' AND turno = '"+turno+"';";
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
        if (result > 0) {
            delete = true;
        }
        return delete;
    }
    
}
