
/**Empleado. Clase básica que describe a un empleado. Incluye sus datos
personales (nombre, apellidos, DNI, dirección) y algunos datos tales como los
años de antigüedad, teléfono de contacto y su salario.
Incluye también información de quién es el empleado que lo supervisa
(Empleado *). Tendrá, al menos, las siguientes funciones miembro:

• Constructores para definir correctamente un empleado, a partir de su nombre, apellidos, DNI, dirección, teléfono y salario.
• Imprimir (A través de los operadores de E/S redefinidos)
• Cambiar supervisor
• Incrementar salario*/
public class Empleado {
	private String nombre;
	private String apellidos;
	private String DNI;
	private String direccion;
	private Integer antiguedad = 2;//lo normal es que sea un calculo
	private Empleado supervisor;
	private String telefono;
	private Double salarioBase = 1000.0;
	private static Integer siguiente=0;
	
	/** Constructor sin antiguedad ni supervisor*/
	public Empleado(String nombre, String apellidos, String dNI, String direccion, String telefono, Double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.direccion = direccion;
		this.telefono = telefono;
		this.salarioBase = salario;
		siguiente++;
		
	}
	public static Integer getSiguiente() {
		return siguiente;
	}
	public static void setSiguiente(Integer siguiente) {
		Empleado.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", supervisor=" + supervisor + ", telefono=" + telefono + ", salario="
				+ salarioBase + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Empleado getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salario) {
		this.salarioBase = salario;
	}

	public double calcularNomnina() {
		double nomina=0;
		return nomina;
	}
}
