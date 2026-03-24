package fabrica;

public class Motor {
	private String tipo;

	/**
	 * @param tipo
	 */
	public Motor(String tipo) {
		super();
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return " Tipo " + tipo;
	}
	
	

}
