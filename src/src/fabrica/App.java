package fabrica;

import banco.Persona;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabrica fabrica =new Fabrica();
		
		Persona persona1 =new Persona("Pachita");
		
		Automovil automovil1 =new Automovil("BMW",2026,persona1,"Electrico");
				
		Llanta llanta1 =new Llanta("GY");
		Llanta llanta2 =new Llanta("GY10");
		Llanta llanta3 =new Llanta("GYy");
		Llanta llanta4 =new Llanta("GG");
		automovil1.agregarLlanta(llanta1);
		automovil1.agregarLlanta(llanta2);
		automovil1.agregarLlanta(llanta3);
		automovil1.agregarLlanta(llanta4);
		
		
		fabrica.agregarAutomovil(automovil1);
		
		fabrica.mostrarAutos();
		
	}

}
