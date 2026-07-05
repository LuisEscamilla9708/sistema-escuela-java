
package paquete.escuela_proyecto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conexion {
private static final String URL = "jdbc:mysql://localhost:3306/escuela_jose_marti";
private static final String USUARIO = "root";
private static final String PASSWORD = "111111";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar");
            System.out.println(e.getMessage());
        }
                   return conexion;
    }
}
