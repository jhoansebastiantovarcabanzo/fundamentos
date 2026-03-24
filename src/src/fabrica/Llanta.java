package fabrica;

public class Llanta {
	private String marca;

	/**
	 * @param marca
	 */
	public Llanta(String marca) {
		super();
		this.marca = marca;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return " Marca " + marca;
	}
	
	

}
