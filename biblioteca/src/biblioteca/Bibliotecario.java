package biblioteca;

/**
 * Representa al bibliotecario encargado del sistema.
 */
public class Bibliotecario {
 /** Nombre del bibliotecario */
    private String nombre;
    /**
     * Constructor
     */
    public Bibliotecario(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Registra un usuario en la biblioteca.
     */
    public void registrarUsuario(Biblioteca biblioteca, Usuario usuario) {
        System.out.println(" Bibliotecario " + nombre + " registra al usuario: " + usuario.getNombre());
        biblioteca.agregarUsuario(usuario);
    }
    /**
     * Realiza el préstamo de un libro.
     */
    public void prestarLibro(Biblioteca biblioteca, Usuario usuario, Libro libro) {
        System.out.println(" Bibliotecario " + nombre + " realiza préstamo del libro '" 
                            + libro.getTitulo() + "' a " + usuario.getNombre());
        biblioteca.realizarPrestamo(usuario, libro);
    }
    /**
     * Recibe la devolución de un préstamo.
     */
    public void recibirDevolucion(Biblioteca biblioteca, Prestamo prestamo) {
        System.out.println("Bibliotecario " + nombre + " recibe devolución");
        biblioteca.realizarDevolucion(prestamo);
    }

    //  Getter
    public String getNombre() {
        return nombre;
    }

    // toString (importante para imprimir)
    @Override
    public String toString() {
        return "Bibliotecario: " + nombre;
    }
}