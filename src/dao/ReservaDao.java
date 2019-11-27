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
    private int idValorTurno;
    private String residenteRut;
    private String numeroDepartamento;
    private String usuarioRut;
    private String fecha;
    private String turno;
 
    
    public ReservaDao() {
        db = new Db();
    }
    
    public List<Reserva> listadoRegistroReservas() {
        List<Reserva> listadoRegistroReservas = new ArrayList<>();
        String sql = "SELECT * FROM reservasala;";
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
                usuarioRut = rs.getString("usuariointerno_rut");
                fecha = rs.getString("fechareserva");
                idValorTurno = rs.getInt("valorturno");
                turno = rs.getString("turno");
                Reserva reserva = new Reserva(id, residenteRut, numeroDepartamento,usuarioRut, fecha, idValorTurno,turno);
              
               
                listadoRegistroReservas.add(reserva);
            }
            db.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoRegistroReservas;
    }
    
}
