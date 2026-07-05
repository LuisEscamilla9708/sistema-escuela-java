
package paquete.escuela_proyecto;

public class Director extends Persona {

    private int id_director;
    private String telefono;
    private String correo;

    public Director(int id_director, String nombre, String apellido, int edad, String telefono, String correo) {
        super(nombre, apellido, edad);
        this.id_director = id_director;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId_director() {
        return id_director;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID director: " + id_director);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
    }
}