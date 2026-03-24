package biblioteca;
/**
 * La clase Libro representa un libro dentro del sistema.
 */
public class Libro {
	  /** ISBN del libro */
    private String isbn;
    /** Título del libro */
    private String titulo;
    /** Título del libro */
    private String autor;
    /** Cantidad de ejemplares disponibles */
    private int ejemplaresDisponibles;
    /**
     * Constructor del libro.
     */
    public Libro(String isbn, String titulo, String autor, int ejemplaresDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
    /**
     * Verifica si el libro está disponible.
     */
    public boolean verificarDisponibilidad() {
        return ejemplaresDisponibles > 0;
    }
    /**
     * Actualiza la cantidad de ejemplares.
     */
    public void actualizarEjemplares(int cantidad) {
        ejemplaresDisponibles += cantidad;
    }
    /**
     * Actualiza la cantidad de ejemplares.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Retorna el estado del libro.
     */

    public String getEstado() {
        if (ejemplaresDisponibles > 0) {
            return "Disponible";
        } else {
            return "No disponible";
        }
    }        
    @Override
    public String toString() {
        return "ISBN: " + isbn + " | " + titulo + " - " + autor + " (" + ejemplaresDisponibles + ")";
    }
}