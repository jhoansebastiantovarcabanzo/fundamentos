package Sistema_transporte;

public class Carro extends Vehiculo {

		private int numeroPuertas;

		public Carro(String placa, String marca, double velocidadMaxima, int numeroPuertas) {
			super(placa, marca, velocidadMaxima);
			this.numeroPuertas = numeroPuertas;
		}
		
		@Override
		public String toString() {
			return "Carro " + super.toString() + " Numero Puertas " + this.numeroPuertas;
		}
		
		@Override
		public String mover() {
			return "El carro se desplaza por carretera";
		}
		
		@Override
		public double calcularPeaje() {
			return 8000 + (this.numeroPuertas * 500);
		}
	}
