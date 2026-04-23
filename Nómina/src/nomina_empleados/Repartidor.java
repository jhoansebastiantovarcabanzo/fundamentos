package nomina_empleados;

public class Repartidor extends Empleado {

    private int numeroRepartos;
    private char zona;

    public Repartidor(int id, String nombre, int edad, int anioIngreso, double salarioBasico, int numeroRepartos, char zona) {
        super(id, nombre, edad, anioIngreso, salarioBasico);
        this.numeroRepartos = numeroRepartos;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            return zona;
        }
        return 'C';
    }

    public double calcularPagoRepartos() {
        return numeroRepartos * 10000;
    }

    @Override
    public double calcularDescuento() {
        double total = salarioBasico + calcularPagoRepartos();
        return total * 0.10;
    }

    @Override
    public double liquidarNomina() {
        double total = salarioBasico + calcularPagoRepartos();

        if ((2025 - anioIngreso) >= 5 && zona == 'C') {
            total += 50000;
        }

        return total - calcularDescuento();
    }

    @Override
    public String toString() {
        return "Repartidor -> " +
                "ID: " + identificacion +
                ", Nombre: " + nombre +
                ", Año: " + anioIngreso +
                ", Salario: " + salarioBasico +
                ", Repartos: " + numeroRepartos +
                ", PagoRepartos: " + calcularPagoRepartos() +
                ", Descuento: " + calcularDescuento() +
                ", Neto: " + liquidarNomina();
    }
}