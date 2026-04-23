package Productos;
import java.util.ArrayList;

public class App {

    private ArrayList<Producto> productos;

    public App() {
        productos = new ArrayList<>();
    }

    public void ejecutar() {
        crearProductos();
        mostrarProductos(); // 👈 solo uno
    }

    private void crearProductos() {
        productos.add(new Perecedero("P1", "Leche", 5000, 1));
        productos.add(new Perecedero("P2", "Queso", 8000, 2));
        productos.add(new Perecedero("P3", "Yogurt", 3000, 3));

        productos.add(new NoPerecedero("NP1", "Arroz", 4000, 'A'));
        productos.add(new NoPerecedero("NP2", "Frijoles", 3500, 'B'));
        productos.add(new NoPerecedero("NP3", "Lentejas", 3200, 'X')); // inválido → B
    }

    private void mostrarProductos() {
        System.out.println("=== PRODUCTOS ===");

        for (Producto producto : productos) {

            if (producto instanceof Perecedero) {
                Perecedero productoPerecedero = (Perecedero) producto;

                System.out.println(
                    "Perecedero | Código: " + productoPerecedero.getCodigo() +
                    " | Descripción: " + productoPerecedero.getDescripcion() +
                    " | Precio: " + productoPerecedero.getPrecio() +
                    " | Días a caducar: " + productoPerecedero.getDiasACaducar() +
                    " | Precio de venta: " + productoPerecedero.calcularPrecioVenta()
                );

            } else if (producto instanceof NoPerecedero) {
                NoPerecedero productoNoPerecedero = (NoPerecedero) producto;

                System.out.println(
                    "No Perecedero | Código: " + productoNoPerecedero.getCodigo() +
                    " | Descripción: " + productoNoPerecedero.getDescripcion() +
                    " | Precio: " + productoNoPerecedero.getPrecio() +
                    " | Tipo: " + productoNoPerecedero.getTipo() +
                    " | Precio de venta: " + productoNoPerecedero.calcularPrecioVenta()
                );
            }
        }
    }
}
