package biblioteca;

/**
 * La clase Libro representa un libro dentro del sistema.
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public boolean verificarDisponibilidad() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEstado() {
        return disponible ? "Disponible" : "No disponible";
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn +
               " | " + titulo +
               " - " + autor +
               " (" + getEstado() + ")";
    }
}