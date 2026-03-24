package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Catalogo representa el conjunto de libros disponibles
 * en la biblioteca. Permite gestionar, buscar y mostrar libros.
 */
public class Catalogo {

    /** Lista de libros del catálogo */
    private List<Libro> libros;

    /**
     * Constructor que inicializa la lista de libros.
     */
    public Catalogo() {
        libros = new ArrayList<>();
    }

    /**
     * Permite agregar un libro al catálogo.
     * @param libro Libro que se desea agregar
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Permite eliminar un libro del catálogo.
     * @param libro Libro que se desea eliminar
     */
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    /**
     * Busca un libro por su título.
     * @param titulo Título del libro a buscar
     * @return el libro encontrado o null si no existe
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
     * Muestra todos los libros del catálogo.
     */
    public void mostrarCatalogo() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    /**
     * Retorna la lista de libros del catálogo.
     * @return lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }
}