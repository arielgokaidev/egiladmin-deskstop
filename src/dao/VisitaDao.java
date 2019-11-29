package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Visita;

public class VisitaDao {
    
    private Db db;
    private Connection conexion;
    
    private int id;
    private int idEstacionamiento;
    private String numeroDepartamento;
    private String autorizaResidente;
    private String fechaIngreso;
    private String fechaSalida;
    private String rut;
    private String nombres;
    private String apellidos;
    private String patente;
     
    public VisitaDao() {
        db = new Db();
    }
    
    public boolean ingresarVisita(String departamento, String autorizaresidente, String fecha, String rut, String nombres, String apellidos) {
        boolean insert = false;
        int result = 0;
        int id = maxRegistroVisita() + 1;
        System.out.println("id: " + id);
        String sql = "INSERT INTO registrovisita "
                + "(idregistrovisita, departamento_numerodpto, autorizaresidente, "
                + "fechaingreso, rut, nombres, apellidos) "
                + "VALUES ("+id+", '"+departamento+"', '"+autorizaresidente+"', '"+fecha+"', '"+rut+"', '"+nombres+"', "
                + "'"+apellidos+"');";
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
    
    public boolean ingresarVisitaEstacionamiento(String departamento, String autorizaresidente, String fecha, String rut, String nombres, String apellidos, String estacionamiento, String patente) {
        boolean insert = false;
        boolean ingresoEstacionamiento = false;
        int result = 0;
        int numeroEstacionamiento = Integer.parseInt(estacionamiento);
        int id = maxRegistroVisita() + 1;
        System.out.println("id: " + id);
        String sql = "INSERT INTO registrovisita "
                + "(idregistrovisita, estacionamientovisita_idestacionamientovisita, departamento_numerodpto, "
                + "autorizaresidente, fechaingreso, rut, nombres, apellidos, patente) "
                + "VALUES ("+id+", "+numeroEstacionamiento+", '"+departamento+"', '"+autorizaresidente+"', "
                + "'"+fecha+"', '"+rut+"', '"+nombres+"', '"+apellidos+"', '"+patente+"');";
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
            ingresoEstacionamiento = ingresoEstacionamiento(numeroEstacionamiento);
            if (ingresoEstacionamiento) {
                insert = true;
            }
        }
        return insert;
    }
    
    public boolean ingresoEstacionamiento(int numeroEstacionamiento) {
        boolean update = false;
        int result = 0;
        String sql = "UPDATE estacionamientovisita SET estado = 'Ocupado' WHERE numero = " + numeroEstacionamiento + ";";
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
            System.out.println("Update OK");
            update = true;
        }
        return update;
    }
    
    public int maxRegistroVisita() {
        int id = 0;
        String sql = "SELECT MAX(idregistrovisita) as id FROM registrovisita;";
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
    
    public List<Visita> listadoRegistroVisitas(String departamento) {
        List<Visita> listadoRegistroVisitas = new ArrayList<Visita>();
        String sql = "SELECT * FROM registrovisita WHERE departamento_numerodpto = '" + departamento + "' ORDER BY fechaingreso DESC;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("idregistrovisita");
                idEstacionamiento = rs.getInt("estacionamientovisita_idestacionamientovisita");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                autorizaResidente = rs.getString("autorizaresidente");
                fechaIngreso = limpiarFecha(rs.getString("fechaingreso"));
                fechaSalida = limpiarFecha(rs.getString("fechasalida"));
                rut = rs.getString("rut");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                patente = rs.getString("patente");
                Visita visita = new Visita(id, idEstacionamiento, numeroDepartamento, autorizaResidente, fechaIngreso, fechaSalida, rut, nombres, apellidos, patente);
                listadoRegistroVisitas.add(visita);
            }
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroVisitas;
    }
    
    public List<Visita> listadoRegistroVisitasSalida(String departamento) {
        List<Visita> listadoRegistroVisitas = new ArrayList<Visita>();
        String sql = "SELECT * FROM registrovisita WHERE departamento_numerodpto = '" + departamento + "' "
                + "AND fechasalida IS NULL ORDER BY fechaingreso DESC;";
        System.out.println(sql);
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                idEstacionamiento = rs.getInt("estacionamientovisita_idestacionamientovisita");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                fechaIngreso = limpiarFecha(rs.getString("fechaingreso"));
                rut = rs.getString("rut");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                patente = rs.getString("patente");
                Visita visita = new Visita(idEstacionamiento, numeroDepartamento, fechaIngreso, rut, nombres, apellidos, patente);
                listadoRegistroVisitas.add(visita);
            }
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroVisitas;
    }
    
    public boolean ingresarSalida(String departamento, String rut, String fecha) {
        boolean update = false;
        int result = 0;
        String sql = "UPDATE registrovisita SET fechasalida = '"+fecha+"' "
                + "WHERE departamento_numerodpto = '"+departamento+"' AND rut = '"+rut+"' "
                + "AND fechasalida IS NULL;";
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
            System.out.println("Update OK");
            update = true;
        }
        return update;
    }
    
    public boolean ingresarSalidaEstacionamiento(String departamento, String rut, String fecha, int numeroEstacionamiento) {
        boolean update = false;
        boolean salidaEstacionamiento = false;
        int result = 0;
        String sql = "UPDATE registrovisita SET fechasalida = '"+fecha+"' "
                + "WHERE departamento_numerodpto = '"+departamento+"' AND rut = '"+rut+"' "
                + "AND fechasalida IS NULL;";
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
            System.out.println("Update OK");
            salidaEstacionamiento = salidaEstacionamiento(numeroEstacionamiento);
            if (salidaEstacionamiento) {
                update = true;
            }
            update = true;
        }
        return update;
    }
    
    public boolean salidaEstacionamiento(int numeroEstacionamiento) {
        boolean update = false;
        int result = 0;
        String sql = "UPDATE estacionamientovisita SET estado = 'Disponible' WHERE numero = " + numeroEstacionamiento + ";";
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
            System.out.println("Update OK");
            update = true;
        }
        return update;
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
    
}
