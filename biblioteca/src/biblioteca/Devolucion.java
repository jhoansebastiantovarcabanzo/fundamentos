package biblioteca;

import java.util.Date;

/**
 * La clase Devolucion representa el proceso de devolución de un préstamo.
 * Permite registrar la fecha en que se devuelve el libro y calcular si hubo retraso.
 */
public class Devolucion {

    /** Fecha en la que se realiza la devolución */
    private Date fechaDevolucion;

    /** Cantidad de días de retraso en la devolución */
    private int diasRetraso;

    /**
     * Registra la devolución de un préstamo.
     * Asigna la fecha actual y cambia el estado del préstamo a devuelto.
     * @param prestamo Objeto préstamo que se desea cerrar
     */
    public void registrarDevolucion(Prestamo prestamo) {
        this.fechaDevolucion = new Date();
        prestamo.cerrarPrestamo();
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
    }

    /**
     * Calcula los días de retraso en la devolución.
     * Actualmente es un valor simulado.
     */
    public void calcularRetraso() {
        diasRetraso = 2;

        if (diasRetraso > 0) {
            System.out.println("Retraso de " + diasRetraso + " dias");
        } else {
            System.out.println("Entregado a tiempo");
        }
    }

    /**
     * Retorna la cantidad de días de retraso.
     * @return dias de retraso
     */
    public int getDiasRetraso() {
        return diasRetraso;
    }

    /**
     * Retorna una representación en texto de la devolución.
     */
    @Override
    public String toString() {
        return "Devolucion -> Fecha: " + fechaDevolucion + 
               " | Dias de retraso: " + diasRetraso;
    }
}