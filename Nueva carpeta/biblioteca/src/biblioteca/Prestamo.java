package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un préstamo realizado por un estudiante.
 */
public class Prestamo {

    private LocalDate fechaPrestamo;
    private String estado;
    private Estudiante estudiante;
    private List<Libro> libros;

    public Prestamo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.fechaPrestamo = LocalDate.now();
        this.estado = "Activo";
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro.verificarDisponibilidad()) {
            libros.add(libro);
            libro.prestar();
        } else {
            System.out.println("El libro no está disponible: " + libro.getTitulo());
        }
    }

    public void cerrarPrestamo() {
        this.estado = "Devuelto";
        for (Libro libro : libros) {
            libro.devolver();
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getEstado() {
        return estado;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Fecha: " + fechaPrestamo +
               " | Estudiante: " + estudiante +
               " | Estado: " + estado +
               " | Libros: " + libros;
    }
}