package biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase principal que gestiona usuarios, libros y préstamos.
 */
public class Biblioteca {
	 /** Lista de usuarios registrados */
    private List<Usuario> usuarios;

    /** Lista de libros disponibles */
    private List<Libro> libros;

    /** Lista de libros disponibles */
    private List<Prestamo> prestamos;
    /**
     * Constructor de la biblioteca.
     */
    public Biblioteca() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }
    /**
     * Agrega un usuario a la biblioteca.
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    /**
     * Busca un usuario por nombre.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    /**
     * Busca un usuario por nombre.
     */
    public Usuario buscarUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }
    /**
     * Busca un libro por título.
     */
    public Libro buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
    /**
     * Realiza un préstamo si el libro está disponible.
     */
    public void realizarPrestamo(Usuario usuario, Libro libro) {
        if (libro.verificarDisponibilidad()) {
            Prestamo p = new Prestamo(usuario);
            p.agregarLibro(libro);
            prestamos.add(p);

            libro.actualizarEjemplares(-1);
            System.out.println("Préstamo realizado");
        } else {
            System.out.println("Libro no disponible");
        }
    }
    /**
     * Procesa la devolución de un préstamo.
     */
    public void realizarDevolucion(Prestamo prestamo) {
        prestamo.cerrarPrestamo();
        System.out.println("Devolución realizada");
    }
    /**
     * Muestra todos los libros.
     */
    public void mostrarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
    /**
     * Muestra todos los usuarios.
     */
    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}