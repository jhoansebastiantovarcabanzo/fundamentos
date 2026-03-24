package fabrica;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	private List<Automovil> listaAutomviles;

	/**
	 * Constructor
	 */
	public Fabrica() {
		super();
		this.listaAutomviles =new ArrayList();
	}
	/**
	 * Recibe como parámetro un objeto de la clase Automóvil. 
	 * Permite adicionar un nuevo objeto de la clase Automóvil 
	 * a la lista de automóviles.
	 * @param automovil
	 */
	public void agregarAutomovil(Automovil automovil) {
		this.listaAutomviles.add(automovil);
	}
    /**
     * Muestra todos los automóviles fabricados.
     */
	public void mostrarAutos() {
		for (Automovil automovil : listaAutomviles) {
			//System.out.println("Marca "+automovil.getMarca()
			  //                 +" Modelo " + automovil.getModelo()
			  //                 +" Propietario "+automovil.getPersona().getNombre()
			  //                 +" Motor "+automovil.getMotor().getTipo()
			  //                 +" Llantas "+automovil.getLlantas().toString());
			System.out.println(automovil);
		}
	}

}
