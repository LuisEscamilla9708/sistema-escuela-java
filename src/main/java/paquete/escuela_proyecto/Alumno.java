
package paquete.escuela_proyecto;

public class Alumno extends Persona {

    private int id_alumno;
    private int grado;
    private String grupo;

    public Alumno(int id_alumno, String nombre, String apellido, int edad, int grado, String grupo) {
        super(nombre, apellido, edad);
        this.id_alumno = id_alumno;
        this.grado = grado;
        this.grupo = grupo;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public int getGrado() {
        return grado;
    }

    public String getGrupo() {
        return grupo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID alumno: " + id_alumno);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grado: " + grado);
        System.out.println("Grupo: " + grupo);
    }
}