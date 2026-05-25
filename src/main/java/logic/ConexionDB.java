package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    
    private static final String URL = "jdbc:sqlserver://DESKTOP-1BOSF6R\\SQLEXPRESS;databaseName=SistemaAcceso;encrypt=false";
    private static final String USUARIO = "admin";
    private static final String CONTRASENA = "1234";
    
    public static Connection getConexion() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}