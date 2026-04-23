package Sistema_transporte;

public class Camion  extends Vehiculo {

		private double capacidadCarga;

		public Camion(String placa, String marca, double velocidadMaxima, double capacidadCarga) {
			super(placa, marca, velocidadMaxima);
			this.capacidadCarga = capacidadCarga;
		}
		
		@Override
		public String toString() {
			return "Camion " + super.toString() + " Capacidad Carga " + this.capacidadCarga;
		}
		
		@Override
		public String mover() {
			return "El camion transporta carga pesada";
		}
		
		@Override
		public double calcularPeaje() {
			return 10000 + (this.capacidadCarga * 1000);
		}
	}
