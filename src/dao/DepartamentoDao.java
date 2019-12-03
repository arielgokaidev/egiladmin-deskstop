package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Departamento;

public class DepartamentoDao {
    
    private Db db;
    private Connection conexion;
    
    private String numeroDepartamento;
    private String torre;
    private int mt2;
    private int numeroEstacionamiento;
    private int numeroBodega;
    
    public DepartamentoDao() {
	db = new Db();
    }
    
    public List<Departamento> listadoDepartamentos() {
        List<Departamento> listadoDepartamentos = new ArrayList<Departamento>();
        String sql = "SELECT * FROM departamento;";
        System.out.println(sql);        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                numeroDepartamento = rs.getString("numerodpto");
                torre = rs.getString("torre");
                mt2 = rs.getInt("totalmts2");
                numeroEstacionamiento = rs.getInt("estacionamiento_numeroest");
                numeroBodega = rs.getInt("bodega_numerobodega");
                Departamento departamento = new Departamento(numeroDepartamento, torre, mt2, numeroBodega, numeroEstacionamiento);
                listadoDepartamentos.add(departamento);
            }
            statement.close();
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return listadoDepartamentos;
    }
    
}
