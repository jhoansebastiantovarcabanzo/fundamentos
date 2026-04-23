package nomina_empleados;

public class Vendedor extends Empleado {

    private double totalVentas;

    public Vendedor(int id, String nombre, int edad, int anioIngreso, double salarioBasico, double totalVentas) {
        super(id, nombre, edad, anioIngreso, salarioBasico);
        this.totalVentas = totalVentas;
    }

    public double calcularComision() {
        return totalVentas * 0.15;
    }

    @Override
    public double calcularDescuento() {
        double subtotal = salarioBasico + calcularComision();
        return subtotal * 0.10;
    }

    @Override
    public double liquidarNomina() {
        double total = salarioBasico + calcularComision();

        if (2025 - anioIngreso > 20) {
            total += 100000;
        }

        return total - calcularDescuento();
    }

    @Override
    public String toString() {
        return "Vendedor -> " +
                "ID: " + identificacion +
                ", Nombre: " + nombre +
                ", Año: " + anioIngreso +
                ", Salario: " + salarioBasico +
                ", TotalVentas: " + totalVentas +
                ", Comisión: " + calcularComision() +
                ", Descuento: " + calcularDescuento() +
                ", Neto: " + liquidarNomina();
    }
}