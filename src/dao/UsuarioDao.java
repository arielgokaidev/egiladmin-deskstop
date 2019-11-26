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
    private String nombres;
    private String apellidos;
    private int idTipoUsuario;
    private String tipoUsuario;
   
    public UsuarioDao() {
        db = new Db();
    }
    
    public List<Usuario> loginUsuario(String usuario) {
        List<Usuario> credenciales = new ArrayList<Usuario>();
        String sql = "SELECT nombres, apellidos, nombreusuario, contrasena, idtipousuario, tipo " +
            "FROM usuariointerno " +
            "INNER JOIN tipousuario ON tipousuario.idtipousuario = usuariointerno.tipousuario_idtipousuario " +
            "WHERE nombreusuario = '" + usuario + "';";
        //String sql = "SELECT nombreusuario, contrasena FROM conexion WHERE nombreusuario = '" + usuario + "';";
        System.out.println(sql);        
        try {
            db.conectar();
            conexion = db.getConexion();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                user = rs.getString("nombreusuario");
                password = rs.getString("contrasena");
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
                idTipoUsuario = rs.getInt("idtipousuario");
                tipoUsuario = rs.getString("tipo");
                Usuario login = new Usuario(user, password, nombres, apellidos, idTipoUsuario, tipoUsuario);
                credenciales.add(login);
            }
            db.desconectar();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } 
        return credenciales;
    }
    
}
