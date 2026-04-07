package biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Estudiante e1 = new Estudiante("Juan");
        Estudiante e2 = new Estudiante("Ana");

        Libro l1 = new Libro("001", "Java Básico", "Autor1");
        Libro l2 = new Libro("002", "Estructuras de Datos", "Autor2");

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        System.out.println("Libros disponibles:");
        biblioteca.mostrarLibros();

        System.out.println("\n Préstamo realizado por Juan:");
        biblioteca.realizarPrestamo(e1, l1);

        System.out.println("\n Libros después del préstamo:");
        biblioteca.mostrarLibros();

        System.out.println("\n Lista de préstamos:");
        biblioteca.mostrarPrestamos();
    }
}