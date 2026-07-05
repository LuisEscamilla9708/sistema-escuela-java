
package paquete.escuela_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoDAO {

    public void agregarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumnos (nombre, apellido, edad, grado, grupo) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getGrado());
            ps.setString(5, alumno.getGrupo());

            ps.executeUpdate();
            System.out.println("Alumno agregado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al agregar alumno");
            System.out.println(e.getMessage());
        }
    }

    public void eliminarAlumno(int id_alumno) {

        String sql = "DELETE FROM alumnos WHERE id_alumno = ?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id_alumno);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Alumno eliminado correctamente");
            } else {
                System.out.println("No se encontró el alumno");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar alumno");
            System.out.println(e.getMessage());
        }
    }

    public void modificarAlumno(int id_alumno, Alumno alumno) {

        String sql = "UPDATE alumnos SET nombre=?, apellido=?, edad=?, grado=?, grupo=? WHERE id_alumno=?";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getGrado());
            ps.setString(5, alumno.getGrupo());
            ps.setInt(6, id_alumno);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Alumno actualizado correctamente");
            } else {
                System.out.println("No se encontró el alumno");
            }

        } catch (SQLException e) {
            System.out.println("Error al modificar alumno");
            System.out.println(e.getMessage());
        }
    }

    public void imprimirAlumno() {

        String sql = "SELECT * FROM alumnos";

        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alumno = new Alumno(
                        rs.getInt("id_alumno"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("grado"),
                        rs.getString("grupo")
                );

                alumno.mostrarDatos();
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir alumnos");
            System.out.println(e.getMessage());
        }
    }
}