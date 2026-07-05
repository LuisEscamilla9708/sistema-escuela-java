
package paquete.escuela_proyecto;


import java.util.Scanner;

public class Escuela_Proyecto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        AlumnoDAO alumnoDAO = new AlumnoDAO();
        MaestroDAO maestroDAO = new MaestroDAO();
        DirectorDAO directorDAO = new DirectorDAO();
        MateriaDAO materiaDAO = new MateriaDAO();
        CalificacionDAO calificacionDAO = new CalificacionDAO();

        int opcion;

        do {
            System.out.println("\n===== Sistema Escuela Jose Marti =====");
            System.out.println("1. Alumnos");
            System.out.println("2. Maestros");
            System.out.println("3. Director");
            System.out.println("4. Materias");
            System.out.println("5. Calificaciones");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

 
                case 1:
                    System.out.println("\n--- ALUMNOS ---");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Ver");

                    int opcionA = entrada.nextInt();

                    switch (opcionA) {

                        case 1:
                            System.out.print("Nombre: ");
                            String nom = entrada.next();

                            System.out.print("Apellido: ");
                            String ape = entrada.next();

                            System.out.print("Edad: ");
                            int edad = entrada.nextInt();

                            System.out.print("Grado: ");
                            int grado = entrada.nextInt();

                            System.out.print("Grupo: ");
                            String grupo = entrada.next();

                            Alumno alumno = new Alumno(0, nom, ape, edad, grado, grupo);
                            alumnoDAO.agregarAlumno(alumno);
                            break;

                        case 2:
                            System.out.print("ID: ");
                            int idA = entrada.nextInt();

                            System.out.print("Nombre: ");
                            nom = entrada.next();

                            System.out.print("Apellido: ");
                            ape = entrada.next();

                            System.out.print("Edad: ");
                            edad = entrada.nextInt();

                            System.out.print("Grado: ");
                            grado = entrada.nextInt();

                            System.out.print("Grupo: ");
                            grupo = entrada.next();

                            alumno = new Alumno(idA, nom, ape, edad, grado, grupo);
                            alumnoDAO.modificarAlumno(idA, alumno);
                            break;

                        case 3:
                            System.out.print("ID a eliminar: ");
                            alumnoDAO.eliminarAlumno(entrada.nextInt());
                            break;

                        case 4:
                            alumnoDAO.imprimirAlumno();
                            break;
                    }
                    break;


                case 2:
                    System.out.println("\n--- MAESTROS ---");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Ver");

                    int opcionM = entrada.nextInt();

                    switch (opcionM) {

                        case 1:
                            System.out.print("Nombre: ");
                            String nom = entrada.next();

                            System.out.print("Apellido: ");
                            String ape = entrada.next();

                            System.out.print("Edad: ");
                            int edad = entrada.nextInt();

                            System.out.print("Especialidad: ");
                            String esp = entrada.next();

                            Maestro maestro = new Maestro(0, nom, ape, edad, esp);
                            maestroDAO.agregarMaestro(maestro);
                            break;

                        case 2:
                            System.out.print("ID: ");
                            int idM = entrada.nextInt();

                            System.out.print("Nombre: ");
                            nom = entrada.next();

                            System.out.print("Apellido: ");
                            ape = entrada.next();

                            System.out.print("Edad: ");
                            edad = entrada.nextInt();

                            System.out.print("Especialidad: ");
                            esp = entrada.next();

                            maestro = new Maestro(idM, nom, ape, edad, esp);
                            maestroDAO.modificarMaestro(idM, maestro);
                            break;

                        case 3:
                            System.out.print("ID a eliminar: ");
                            maestroDAO.eliminarMaestro(entrada.nextInt());
                            break;

                        case 4:
                            maestroDAO.imprimirMaestro();
                            break;
                    }
                    break;

    
                case 3:
                    System.out.println("\n--- DIRECTOR ---");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Ver");

                    int opcionD = entrada.nextInt();

                    switch (opcionD) {

                        case 1:
                            System.out.print("Nombre: ");
                            String nom = entrada.next();

                            System.out.print("Apellido: ");
                            String ape = entrada.next();

                            System.out.print("Edad: ");
                            int edad = entrada.nextInt();

                            System.out.print("Telefono: ");
                            String tel = entrada.next();

                            System.out.print("Correo: ");
                            String cor = entrada.next();

                            Director director = new Director(0, nom, ape, edad, tel, cor);
                            directorDAO.agregarDirector(director);
                            break;

                        case 2:
                            System.out.print("ID: ");
                            int idD = entrada.nextInt();

                            System.out.print("Nombre: ");
                            nom = entrada.next();

                            System.out.print("Apellido: ");
                            ape = entrada.next();

                            System.out.print("Edad: ");
                            edad = entrada.nextInt();

                            System.out.print("Telefono: ");
                            tel = entrada.next();

                            System.out.print("Correo: ");
                            cor = entrada.next();

                            director = new Director(idD, nom, ape, edad, tel, cor);
                            directorDAO.modificarDirector(idD, director);
                            break;

                        case 3:
                            System.out.print("ID a eliminar: ");
                            directorDAO.eliminarDirector(entrada.nextInt());
                            break;

                        case 4:
                            directorDAO.imprimirDirector();
                            break;
                    }
                    break;


                case 4:
                    System.out.println("\n--- MATERIAS ---");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Ver");

                    int opcionMat = entrada.nextInt();

                    switch (opcionMat) {

                        case 1:
                            System.out.print("Nombre materia: ");
                            String nomMat = entrada.next();

                            System.out.print("ID maestro: ");
                            int idMae = entrada.nextInt();

                            materiaDAO.agregarMateria(nomMat, idMae);
                            break;

                        case 2:
                            System.out.print("ID materia: ");
                            int idMat = entrada.nextInt();

                            System.out.print("Nombre: ");
                            nomMat = entrada.next();

                            System.out.print("ID maestro: ");
                            idMae = entrada.nextInt();

                            materiaDAO.modificarMateria(idMat, nomMat, idMae);
                            break;

                        case 3:
                            System.out.print("ID a eliminar: ");
                            materiaDAO.eliminarMateria(entrada.nextInt());
                            break;

                        case 4:
                            materiaDAO.imprimirMateria();
                            break;
                    }
                    break;


                case 5:
                    System.out.println("\n--- CALIFICACIONES ---");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Ver");

                    int opcionC = entrada.nextInt();

                    switch (opcionC) {

                        case 1:
                            System.out.print("ID alumno: ");
                            int idAl = entrada.nextInt();

                            System.out.print("ID materia: ");
                            int idMat = entrada.nextInt();

                            System.out.print("Calificacion: ");
                            double cal = entrada.nextDouble();

                            calificacionDAO.agregarCalificacion(idAl, idMat, cal);
                            break;

                        case 2:
                            System.out.print("ID calificacion: ");
                            int idCal = entrada.nextInt();

                            System.out.print("Nueva calificacion: ");
                            cal = entrada.nextDouble();

                            calificacionDAO.modificarCalificacion(idCal, cal);
                            break;

                        case 3:
                            System.out.print("ID a eliminar: ");
                            calificacionDAO.eliminarCalificacion(entrada.nextInt());
                            break;

                        case 4:
                            calificacionDAO.imprimirCalificaciones();
                            break;
                    }
                    break;

            }

        } while (opcion != 0);

        System.out.println("Sistema finalizado");
    }
}