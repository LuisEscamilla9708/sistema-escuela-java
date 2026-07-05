
package paquete.escuela_proyecto;

public class Materia {

    private int id_materia;
    private String nombre_materia;
    private int id_maestro;

    public Materia(int id_materia, String nombre_materia, int id_maestro) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
        this.id_maestro = id_maestro;
    }

    public int getId_materia() {
        return id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public int getId_maestro() {
        return id_maestro;
    }

    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID materia: " + id_materia);
        System.out.println("Nombre: " + nombre_materia);
        System.out.println("ID maestro: " + id_maestro);
    }
}