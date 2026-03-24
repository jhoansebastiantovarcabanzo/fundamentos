package Herencia;

public class Persona {
	protected int id;
	protected String nombre;
	/**
	 * @param id
	 * @param nombre
	 */
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
