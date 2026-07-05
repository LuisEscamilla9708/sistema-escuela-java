CREATE DATABASE escuela_jose_marti;
USE escuela_jose_marti;

CREATE TABLE director (
    id_director INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    telefono VARCHAR(20),
    correo VARCHAR(50)
);

CREATE TABLE maestros (
    id_maestro INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    especialidad VARCHAR(50)
);

CREATE TABLE alumnos (
    id_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    grado INT,
    grupo VARCHAR(5)
);

CREATE TABLE materias (
    id_materia INT AUTO_INCREMENT PRIMARY KEY,
    nombre_materia VARCHAR(50),
    id_maestro INT
);

CREATE TABLE calificaciones (
    id_calificacion INT AUTO_INCREMENT PRIMARY KEY,
    id_alumno INT,
    id_materia INT,
    calificacion DOUBLE
);

DIRECTOR
INSERT INTO director (nombre, apellido, edad, telefono, correo)
VALUES ('Carlos', 'Ramirez', 55, '5551234567', 'director@escuela.com');

MAESTROS
INSERT INTO maestros (nombre, apellido, edad, especialidad) VALUES
('Ana', 'Lopez', 40, 'Matematicas'),
('Luis', 'Garcia', 38, 'Historia');

ALUMNOS
INSERT INTO alumnos (nombre, apellido, edad, grado, grupo) VALUES
('Juan', 'Perez', 12, 1, 'A'),
('Maria', 'Hernandez', 13, 2, 'B');
