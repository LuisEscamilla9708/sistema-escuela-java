
package paquete.escuela_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MaestroDAO {

    public void agregarMaestro(Maestro maestro) {

        String sql = "INSERT INTO maestros (nombre, apellido, especialidad) VALUES (?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, maestro.getNombre());
            ps.setString(2, maestro.getApellido());
            ps.setString(3, maestro.getEspecialidad());

            ps.executeUpdate();
            System.out.println("Maestro agregado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al agregar maestro");
        }
    }

    public void eliminarMaestro(int id_maestro) {

        String sql = "DELETE FROM maestros WHERE id_maestro=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id_maestro);
            ps.executeUpdate();

            System.out.println("Maestro eliminado");

        } catch (SQLException e) {
            System.out.println("Error al eliminar maestro");
        }
    }

    public void modificarMaestro(int id_maestro, Maestro maestro) {

        String sql = "UPDATE maestros SET nombre=?, apellido=?, especialidad=? WHERE id_maestro=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, maestro.getNombre());
            ps.setString(2, maestro.getApellido());
            ps.setString(3, maestro.getEspecialidad());
            ps.setInt(4, id_maestro);

            ps.executeUpdate();

            System.out.println("Maestro actualizado");

        } catch (SQLException e) {
            System.out.println("Error al modificar maestro");
        }
    }

    public void imprimirMaestro() {

        String sql = "SELECT * FROM maestros";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Maestro maestro = new Maestro(
                        rs.getInt("id_maestro"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("especialidad")
                );

                maestro.mostrarDatos();
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir maestros");
        }
    }
}