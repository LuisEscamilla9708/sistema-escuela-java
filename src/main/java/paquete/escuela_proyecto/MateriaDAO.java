
package paquete.escuela_proyecto;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MateriaDAO {

    public void agregarMateria(String nombre, int id_maestro) {

        String sql = "INSERT INTO materias (nombre_materia, id_maestro) VALUES (?, ?)";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, id_maestro);

            ps.executeUpdate();
            System.out.println("Materia agregada");

        } catch (SQLException e) {
            System.out.println("Error al agregar materia");
        }
    }

    public void eliminarMateria(int id_materia) {

        String sql = "DELETE FROM materias WHERE id_materia=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id_materia);
            ps.executeUpdate();

            System.out.println("Materia eliminada");

        } catch (SQLException e) {
            System.out.println("Error al eliminar materia");
        }
    }

    public void modificarMateria(int id_materia, String nombre, int id_maestro) {

        String sql = "UPDATE materias SET nombre_materia=?, id_maestro=? WHERE id_materia=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, id_maestro);
            ps.setInt(3, id_materia);

            ps.executeUpdate();

            System.out.println("Materia actualizada");

        } catch (SQLException e) {
            System.out.println("Error al modificar materia");
        }
    }

    public void imprimirMateria() {

        String sql = "SELECT * FROM materias";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("*****************");
                System.out.println("ID materia: " + rs.getInt("id_materia"));
                System.out.println("Nombre: " + rs.getString("nombre_materia"));
                System.out.println("ID maestro: " + rs.getInt("id_maestro"));
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir materias");
        }
    }
}