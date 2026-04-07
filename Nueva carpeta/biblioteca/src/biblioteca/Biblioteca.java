package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que gestiona libros y préstamos.
 */
public class Biblioteca {

    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public void realizarPrestamo(Estudiante estudiante, Libro libro) {
        if (libro.verificarDisponibilidad()) {
            Prestamo p = new Prestamo(estudiante);
            p.agregarLibro(libro);
            prestamos.add(p);
            System.out.println("✅ Préstamo realizado");
        } else {
            System.out.println("❌ Libro no disponible");
        }
    }

    public void realizarDevolucion(Prestamo prestamo) {
        prestamo.cerrarPrestamo();
        System.out.println("Devolución realizada");
    }

    public void mostrarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}