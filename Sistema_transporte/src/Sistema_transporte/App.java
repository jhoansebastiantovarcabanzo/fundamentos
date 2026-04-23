package Sistema_transporte;

public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Carro miCarro = new Carro("ABC123","Toyota",180,4);
			System.out.println(miCarro);
			System.out.println(miCarro.mover());
			System.out.println("Valor Peaje " + miCarro.calcularPeaje());
			
			
			Moto mimoto = new Moto("XYZ789","Yamaha",140,"Deportiva");
			System.out.println(mimoto);
			System.out.println(mimoto.mover());
			System.out.println("Valor Peaje " + mimoto.calcularPeaje());
			
			
			Camion micamion = new Camion("LMN456","Volvo",120,10.5);
			System.out.println(micamion);
			System.out.println(micamion.mover());
			System.out.println("Valor Peaje " + micamion.calcularPeaje());

		}

	}
