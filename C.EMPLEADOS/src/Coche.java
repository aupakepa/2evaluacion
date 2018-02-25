/**Tiene coche de la empresa (identificado por la matricula, marca y
modelo)*/

public class Coche {
	private String marca;
	private String matricula;
	private String modelo;
	/**
	 * @param marca
	 * @param matricula
	 * @param modelo
	 */
	public Coche(String marca, String matricula, String modelo) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + "]";
	}
	
}
