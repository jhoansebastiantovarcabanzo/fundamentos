package Productos;

public class Perecedero extends Producto {
    private int diasACaducar;

        public Perecedero(String codigo, String descripcion, double precio, int diasACaducar) {
            super(codigo, descripcion, precio);
            this.diasACaducar = diasACaducar;
        }

        public int getDiasACaducar() {   // 👈 ESTE MÉTODO
            return diasACaducar;
        }

        @Override
        public double calcularPrecioVenta() {
            if (diasACaducar == 1) return precio / 4;
            if (diasACaducar == 2) return precio / 3;
            if (diasACaducar == 3) return precio / 2;
            return precio;
        }
 
    @Override
    public String toString() {
        return "Perecedero | " + super.toString() +
               " | Días a caducar: " + diasACaducar;
    }
    
}

