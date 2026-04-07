package biblioteca;

/**
 * Representa a un estudiante que puede solicitar préstamos.
 */
public class Estudiante {

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarPrestamo(Libro libro) {
        System.out.println(nombre + " solicita el libro: " + libro.getTitulo());
    }

    @Override
    public String toString() {
        return nombre;
    }
}