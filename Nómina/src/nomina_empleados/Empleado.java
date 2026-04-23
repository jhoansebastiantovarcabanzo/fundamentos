package nomina_empleados;

public abstract class Empleado {
    protected int identificacion;
    protected String nombre;
    protected int edad;
    protected int anioIngreso;
    protected double salarioBasico;

    public Empleado(int identificacion, String nombre, int edad, int anioIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.salarioBasico = salarioBasico;
    }

    public abstract double liquidarNomina();
    public abstract double calcularDescuento();
}