package nomina_empleados;
import java.util.ArrayList;

public class App {

    private ArrayList<Empleado> empleados;

    public App() {
        empleados = new ArrayList<>();
    }

    public void ejecutar() {

        // ✔ Paso 1: Crear arreglo dinámico
        empleados.add(new Vendedor(1, "Juan", 30, 2000, 1000000, 5000000));
        empleados.add(new Vendedor(2, "Ana", 28, 2010, 1200000, 3000000));
        empleados.add(new Vendedor(3, "Luis", 40, 1995, 1500000, 7000000));

        empleados.add(new Repartidor(4, "Carlos", 25, 2020, 900000, 50, 'A'));
        empleados.add(new Repartidor(5, "Maria", 35, 2018, 950000, 70, 'C'));
        empleados.add(new Repartidor(6, "Pedro", 45, 2015, 1100000, 80, 'D'));

        // ✔ Paso 2: Mostrar inicial
        System.out.println("=== DATOS INICIALES ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // ✔ Paso 3: Liquidar nómina (IMPORTANTE)
        System.out.println("\n=== LIQUIDANDO NÓMINA ===");
        for (Empleado e : empleados) {
            e.liquidarNomina();
        }

        // ✔ Paso 4: Mostrar final
        System.out.println("\n=== DATOS FINALES ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}