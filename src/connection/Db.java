package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    
    private Connection conexion;
    private String url;
    private String user;
    private String pass;
    
    public Db() {
        url = "jdbc:mysql://localhost/egiladmin";
        user = "root";
        pass = "";
    }
    
    public void conectar() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            conexion = DriverManager.getConnection(url, user, pass);
        }
    }
     
    public void desconectar() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }

    public Connection getConexion() {
	return conexion;
    }  
    
}
