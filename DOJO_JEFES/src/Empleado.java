import utilidades.Fecha;

public class Empleado {
	private String nombre;
	private Fecha fecha_nacimiento;
	private Integer numero_empleado;
	private static int siguiente = 0;
	private static Float salario_base = (float) 735;
	private Fecha fechaIngreso;

	public Empleado(String nombre, Fecha fecha_nacimiento, Fecha fechaIngreso) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.numero_empleado = siguiente + 10;
		this.fechaIngreso = fechaIngreso;
		siguiente++;
	}

	/*
	 * public int edadEmpleado() {
	 * 
	 * }
	 */

	public Float calculoNomina(Fecha sysdate) {
		Float resultado = getSalario_base();
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Fecha fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Integer getNumero_empleado() {
		return numero_empleado;
	}

	public void setNumero_empleado(Integer numero_empleado) {
		this.numero_empleado = numero_empleado;
	}

	public static int getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(int siguiente) {
		Empleado.siguiente = siguiente;
	}

	public static Float getSalario_base() {
		return salario_base;
	}

	public static void setSalario_base(Float salario_base) {
		Empleado.salario_base = salario_base;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numero_empleado=" + numero_empleado + ", salario_base=" + salario_base
				+ "]";
	}

}
