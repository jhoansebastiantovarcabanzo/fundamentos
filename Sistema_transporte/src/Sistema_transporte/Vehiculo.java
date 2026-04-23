package Sistema_transporte;

public class Vehiculo {

		protected String placa;
		protected String marca;
		protected double velocidadMaxima;
		
		public Vehiculo(String placa, String marca, double velocidadMaxima) {
			super();
			this.placa = placa;
			this.marca = marca;
			this.velocidadMaxima = velocidadMaxima;
		}

		@Override
		public String toString() {
			return "Placa " + this.placa + " Marca " + this.marca + " Velocidad Maxima " + this.velocidadMaxima;
		}
		
		public String mover() {
			return "";
		}
		
		public double calcularPeaje() {
			return 0;
		}
	}
