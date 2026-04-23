package Sistema_transporte;

public class Moto extends Vehiculo {

		private String tipo;

		public Moto(String placa, String marca, double velocidadMaxima, String tipo) {
			super(placa, marca, velocidadMaxima);
			this.tipo = tipo;
		}
		
		@Override
		public String toString() {
			return "Moto " + super.toString() + " Tipo " + this.tipo;
		}
		
		@Override
		public String mover() {
			return "La moto se desplaza agilmente";
		}
		
		@Override
		public double calcularPeaje() {
			if(this.tipo.equalsIgnoreCase("Deportiva")) {
				return 6000;
			} else {
				return 4000;
			}
		}
	}
