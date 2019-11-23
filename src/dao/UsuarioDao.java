package dao;

import connection.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Usuario;

public class UsuarioDao {
    
    private Db db;
    private Connection conexion;
    
    private String user;
    private String password;
    
    public UsuarioDao() {
        db = new Db();
    }
    
    public List<Usuario> loginUsuario(String usuario) {
        List<Usuario> credenciales = new ArrayList<Usuario>();
        String sql = "SELECT nombreusuario, contrasena FROM conexion WHERE nombreusuario = '" + usuario + "';";
        System.out.println(sql);
        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString("nombreusuario");
                password = rs.getString("contrasena");
                Usuario login = new Usuario(user, password);
                credenciales.add(login);
            }
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return credenciales;
    }
    
}
