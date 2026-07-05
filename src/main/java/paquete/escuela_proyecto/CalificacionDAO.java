
package paquete.escuela_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalificacionDAO {

    public void agregarCalificacion(int id_alumno, int id_materia, double calificacion) {

        String sql = "INSERT INTO calificaciones (id_alumno, id_materia, calificacion) VALUES (?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
            ps.setDouble(3, calificacion);

            ps.executeUpdate();
            System.out.println("Calificación agregada");

        } catch (SQLException e) {
            System.out.println("Error al agregar calificación");
        }
    }

    public void eliminarCalificacion(int id_calificacion) {

        String sql = "DELETE FROM calificaciones WHERE id_calificacion=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id_calificacion);
            ps.executeUpdate();

            System.out.println("Calificación eliminada");

        } catch (SQLException e) {
            System.out.println("Error al eliminar calificación");
        }
    }

    public void modificarCalificacion(int id_calificacion, double nuevaCalificacion) {

        String sql = "UPDATE calificaciones SET calificacion=? WHERE id_calificacion=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setDouble(1, nuevaCalificacion);
            ps.setInt(2, id_calificacion);

            ps.executeUpdate();

            System.out.println("Calificación actualizada");

        } catch (SQLException e) {
            System.out.println("Error al modificar calificación");
        }
    }

    public void imprimirCalificaciones() {

        String sql = "SELECT * FROM calificaciones";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("*****************");
                System.out.println("ID calificación: " + rs.getInt("id_calificacion"));
                System.out.println("ID alumno: " + rs.getInt("id_alumno"));
                System.out.println("ID materia: " + rs.getInt("id_materia"));
                System.out.println("Calificación: " + rs.getDouble("calificacion"));
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir calificaciones");
        }
    }
}
