import java.util.Arrays;

/**3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca y
modelo), teléfono móvil, área de venta, lista de clientes y porcentaje que se lleva
de las ventas en concepto de comisiones. Incrementa su salario un 10% anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Dar de alta un nuevo cliente.
• Dar de baja un cliente.
• Cambiar de coche.*/
public class Vendedor extends Empleado {

	private Coche coche;
	private String movil;
	private String area;
	private double comision;
	private String clientes[];
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public String[] getClientes() {
		return clientes;
	}
	public void setClientes(String[] clientes) {
		this.clientes = clientes;
	}
	@Override
	public String toString() {
		return super.toString()+ "Vendedor [coche=" + coche + ", movil=" + movil + ", area=" + area + ", comision=" + comision
				+ ", clientes=" + Arrays.toString(clientes) + "]";
	}
	/*constructor por defecto*/
	public Vendedor(String nombre, String apellidos, String dNI, String direccion, String telefono, Double salario,
			Coche coche, String movil, String area, double comision, String[] clientes) {
		super(nombre, apellidos, dNI, direccion, telefono, salario);
		this.coche = coche;
		this.movil = movil;
		this.area = area;
		this.comision = comision;
		this.clientes = clientes;
	}
	
	
}
