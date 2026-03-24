package biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa un préstamo de libros a un usuario.
 */
public class Prestamo {
	/** Fecha en la que se realiza el préstamo */
    private Date fechaPrestamo;
    /** Fecha en la que se realiza el préstamo */
    private String estado;
    /** Usuario que realiza el préstamo */
    private Usuario usuario;
    /** Lista de libros prestados */
    private List<Libro> libros;
    /**
     * Constructor del préstamo.
     */
    public Prestamo(Usuario usuario) {
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
        this.estado = "Activo";
        this.libros = new ArrayList<>();
    }
    /**
     * Constructor del préstamo.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    /**
     * Agrega un libro al préstamo.
     */
    public void cerrarPrestamo() {
        estado = "Devuelto";
    }

    //  Getter 
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    //  toString 
    @Override
    public String toString() {
        return " Fecha del préstamo: " + fechaPrestamo +
               " | Usuario: " + usuario +
               " | Estado: " + estado;
    }
}