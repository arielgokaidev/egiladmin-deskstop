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
    private int valorEstacionamiento;
    private int idVisitaVehiculo;
    private String visitaRut;
    private String numeroDepartamento;
    private String autorizaResidente;
    private String observacion;
    private String fechaIngreso;
    private String fechaSalida;
    
    public VisitaDao() {
        db = new Db();
    }
    
    public List<Visita> listadoRegistroVisitas() {
        List<Visita> listadoRegistroVisitas = new ArrayList<Visita>();
        String sql = "SELECT * FROM registrovisita;";
        System.out.println(sql);
        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("idregistrovisita");
                valorEstacionamiento = rs.getInt("valorestacionamiento_idvalorestacionamiento");
                idVisitaVehiculo = rs.getInt("visitavehiculo_idvisitavehiculo");
                visitaRut = rs.getString("visita_rut");
                numeroDepartamento = rs.getString("departamento_numerodpto");
                autorizaResidente = rs.getString("autorizaresidente");
                observacion = rs.getString("observacion");
                fechaIngreso = rs.getString("fechaingreso");
                fechaSalida = rs.getString("fechasalida");
                Visita visita = new Visita(id, valorEstacionamiento, idVisitaVehiculo, visitaRut, numeroDepartamento, autorizaResidente, observacion, fechaIngreso, fechaSalida);
                listadoRegistroVisitas.add(visita);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroVisitas;
    }
    
}
