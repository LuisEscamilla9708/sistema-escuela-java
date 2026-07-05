
package paquete.escuela_proyecto;

public class Maestro extends Persona {

    private int id_maestro;
    private String especialidad;

    public Maestro(int id_maestro, String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.id_maestro = id_maestro;
        this.especialidad = especialidad;
    }

    public int getId_maestro() {
        return id_maestro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID maestro: " + id_maestro);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + especialidad);
    }
}