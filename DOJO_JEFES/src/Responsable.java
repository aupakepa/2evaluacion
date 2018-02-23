import utilidades.Fecha;

public class Responsable extends Empleado {
	private Float bono;
	private String departamento;
	private int personasACargo;
	private static Float plusResponsabilidad = 500.f;

	public Float calculoNomina(Fecha sysdate) {
		float nomina = super.calculoNomina(sysdate) + this.bono + plusResponsabilidad * personasACargo;
		return nomina;

	}

	public Float getBono() {
		return bono;
	}

	public void setBono(Float bono) {
		this.bono = bono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonasACargo() {
		return personasACargo;
	}

	public void setPersonasACargo(int personasACargo) {
		this.personasACargo = personasACargo;
	}

	public static Float getPlusResponsabilidad() {
		return plusResponsabilidad;
	}

	public static void setPlusResponsabilidad(Float plusResponsabilidad) {
		Responsable.plusResponsabilidad = plusResponsabilidad;
	}

	@Override
	public String toString() {
		return "Responsable [bono=" + bono + ", departamento=" + departamento + ", personasACargo=" + personasACargo
				+ "]" + "\n";
	}

	public Responsable(String nombre, Fecha fecha_nacimiento, Fecha fechaIngreso, Float bono, String departamento) {
		super(nombre, fecha_nacimiento, fechaIngreso);
		this.bono = bono;
		this.departamento = departamento;
		this.personasACargo = 0;
	}

}
