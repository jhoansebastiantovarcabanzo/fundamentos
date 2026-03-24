package fabrica;

import java.util.ArrayList;
import java.util.List;
import banco.Persona;

public class Automovil {
	private String marca;
	private int modelo;
	private Motor motor;
	private Persona persona;
	private List<Llanta> llantas;
	/**
	 * @param marca
	 * @param modelo
	 * @param persona
	 */
	public Automovil(String marca, int modelo, Persona persona, String tipoMotor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		//Asociación
		this.persona = persona;
		//Composición
		this.motor =new Motor(tipoMotor);
		//Compsición
		this.llantas =new ArrayList();
	}
	/**
	 * Recibe como parámetro un objeto de la clase
	 * Llanta y permite adicionar la referencia al objeto
	 * a la lista de llantas del automóvil
	 * @param llanta
	 */
	public void agregarLlanta(Llanta llanta) {
		this.llantas.add(llanta);
		
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
	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	/**
	 * @return the llantas
	 */
	public List<Llanta> getLlantas() {
		return llantas;
	}
	/**
	 * @param llantas the llantas to set
	 */
	public void setLlantas(List<Llanta> llantas) {
		this.llantas = llantas;
	}
	@Override
	public String toString() {
		return "Automovil " + marca + " Modelo " + modelo + " Motor " + motor + " Propietario " + persona
				+ "Llantas " + llantas;
	}
}
