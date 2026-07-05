
package paquete.escuela_proyecto;

public class Calificacion {

    private int id_calificacion;
    private int id_alumno;
    private int id_materia;
    private double calificacion;

    public Calificacion(int id_calificacion, int id_alumno, int id_materia, double calificacion) {
        this.id_calificacion = id_calificacion;
        this.id_alumno = id_alumno;
        this.id_materia = id_materia;
        this.calificacion = calificacion;
    }

    public int getId_calificacion() {
        return id_calificacion;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public int getId_materia() {
        return id_materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID calificacion: " + id_calificacion);
        System.out.println("ID alumno: " + id_alumno);
        System.out.println("ID materia: " + id_materia);
        System.out.println("Calificacion: " + calificacion);
    }
}