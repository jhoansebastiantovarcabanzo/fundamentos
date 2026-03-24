package biblioteca;
/**
 * La clase Usuario representa a un lector registrado en la biblioteca.
 */
import java.util.Date;

public class Usuario {
	/**
	 * La clase Usuario representa a un lector registrado en la biblioteca.
	 */
    private String nombre;

    /** Nombre del usuario */
    private String direccion;
    /** Dirección del usuario */
    private String telefono;
    /** Teléfono del usuario */
    private Date fechaRegistro;
    /**
     * Constructor que inicializa los datos del usuario.
     * @param nombre Nombre del usuario
     * @param direccion Dirección del usuario
     * @param telefono Teléfono del usuario
     * @param fechaRegistro Fecha de registro
     */

    public Usuario(String nombre, String direccion, String telefono, Date fechaRegistro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Retorna el nombre del usuario.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Permite solicitar un préstamo de un libro.
     * @param libro Libro solicitado
     */
    public void solicitarPrestamo(Libro libro) {
        System.out.println(nombre + " solicita el libro: " + libro.getTitulo());
    }
    /**
     * Permite solicitar un préstamo de un libro.
     * @param libro Libro solicitado
     */
    @Override
    public String toString() {
        return "Usuario: " + nombre +
               " | Dirección: " + direccion +
               " | Teléfono: " + telefono +
               " | Registro: " + fechaRegistro;
    
    }
}