package Prueba;

public class Jefe extends Empleado {
	private String cargo;
	private String departamento;

	public String getTitulo() {
		return cargo;
	}

	public void setCargo(String titulo) {
		this.cargo = titulo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Jefe(String nombre, double sueldo, String titulo, String departamento) {
		super(nombre, sueldo);
		this.cargo = titulo;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Jefe [titulo=" + cargo + ", departamento=" + departamento + "]" + "\n";
	}
}
