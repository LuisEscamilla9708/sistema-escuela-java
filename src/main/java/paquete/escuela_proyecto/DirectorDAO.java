
package paquete.escuela_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectorDAO {

    public void agregarDirector(Director director) {

        String sql = "INSERT INTO director (nombre, apellido, telefono, correo) VALUES (?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, director.getNombre());
            ps.setString(2, director.getApellido());
            ps.setString(3, director.getTelefono());
            ps.setString(4, director.getCorreo());

            ps.executeUpdate();
            System.out.println("Director agregado");

        } catch (SQLException e) {
            System.out.println("Error al agregar director");
        }
    }

    public void eliminarDirector(int id) {

        String sql = "DELETE FROM director WHERE id_director=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Director eliminado");

        } catch (SQLException e) {
            System.out.println("Error al eliminar director");
        }
    }

    public void modificarDirector(int id, Director director) {

        String sql = "UPDATE director SET nombre=?, apellido=?, telefono=?, correo=? WHERE id_director=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, director.getNombre());
            ps.setString(2, director.getApellido());
            ps.setString(3, director.getTelefono());
            ps.setString(4, director.getCorreo());
            ps.setInt(5, id);

            ps.executeUpdate();

            System.out.println("Director actualizado");

        } catch (SQLException e) {
            System.out.println("Error al modificar director");
        }
    }

    public void imprimirDirector() {

        String sql = "SELECT * FROM director";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Director director = new Director(
                        rs.getInt("id_director"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"), 
                        rs.getString("telefono"),
                        rs.getString("correo")
                );

                director.mostrarDatos();
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir director");
        }
    }
}