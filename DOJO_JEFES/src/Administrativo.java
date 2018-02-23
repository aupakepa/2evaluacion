import utilidades.Fecha;

public class Administrativo extends Empleado {
	private static Float plusAntiguedad = 50.f;
	private String departamento;
	private Responsable jefe;

	public Administrativo(String nombre, Fecha fecha_nacimiento, Fecha fechaIngreso, String departamento,
			Responsable jefe) {
		super(nombre, fecha_nacimiento, fechaIngreso);
		this.departamento = departamento;
		this.jefe = jefe;
		jefe.setPersonasACargo(jefe.getPersonasACargo() + 1);
	}

	public Float calculoNomina(Fecha sysdate) {
		int antiguedad = (int) ((super.getFechaIngreso().difFechas(sysdate)) / 365);
		Float resultado = super.calculoNomina(sysdate) + antiguedad * plusAntiguedad;
		return resultado;
	}

	public static Float getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public static void setPlusAntiguedad(Float plusAntiguedad) {
		Administrativo.plusAntiguedad = plusAntiguedad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Responsable getJefe() {
		return jefe;
	}

	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Administrativo [departamento=" + departamento + ", jefe=" + jefe + "]" + "\n";
	}

}
