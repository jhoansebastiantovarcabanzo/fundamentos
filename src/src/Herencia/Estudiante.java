package Herencia;

public class Estudiante extends Persona{
	private String asignatura;

	/**
	 * @param id
	 * @param nombre
	 * @param asignatura
	 */
	public Estudiante(int id, String nombre, String asignatura) {
		super(id, nombre);
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return super.toString()+" Asignatura" + asignatura;
	}
	
	
	
	
	
	
	
	
	

}
