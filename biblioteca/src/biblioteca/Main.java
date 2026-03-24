package biblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear bibliotecario
        Bibliotecario b1 = new Bibliotecario("Carlos");

        // Crear usuarios
        Usuario u1 = new Usuario("Juan", "Calle 1", "123", new Date());
        Usuario u2 = new Usuario("Ana", "Calle 2", "456", new Date());

        // Crear libros
        Libro l1 = new Libro("001", "Java Básico", "Autor1", 5);
        Libro l2 = new Libro("002", "POO Avanzada", "Autor2", 3);

        // Registrar usuarios
        System.out.println("Registro de usuarios");
        b1.registrarUsuario(biblioteca, u1);
        b1.registrarUsuario(biblioteca, u2);

        // Agregar libros
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        // Mostrar datos iniciales
        System.out.println("\nUsuarios");
        biblioteca.mostrarUsuarios();

        System.out.println("\nLibros");
        biblioteca.mostrarLibros();

        // Realizar préstamo
        System.out.println("\nPrestamo");
        b1.prestarLibro(biblioteca, u1, l1);

        // Crear préstamo para mostrar info
        Prestamo prestamo = new Prestamo(u1);
        prestamo.agregarLibro(l1);

        System.out.println("\nInformacion del prestamo");
        System.out.println(prestamo);

        // Mostrar libros después del préstamo
        System.out.println("\nLibros despues del prestamo");
        biblioteca.mostrarLibros();

        // 🔹 DEVOLUCIÓN
        System.out.println("\nDevolucion");
        b1.recibirDevolucion(biblioteca, prestamo);

        // Mostrar libros después de devolución
        System.out.println("\nLibros despues de la devolucion");
        biblioteca.mostrarLibros();

        // Búsquedas
        System.out.println("\nBuscar libro");
        System.out.println(biblioteca.buscarLibro("Java Básico"));

    }
}