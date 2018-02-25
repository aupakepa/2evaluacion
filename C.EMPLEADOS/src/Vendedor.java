import java.util.Arrays;

import utilidades.Leer;

/**
 * 3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca
 * y modelo), teléfono móvil, área de venta, lista de clientes y porcentaje
 * que se lleva de las ventas en concepto de comisiones. Incrementa su salario
 * un 10% anual. Tendrá, al menos, las siguientes funciones miembro: +
 * Constructores (debe rellenar la información personal y los datos
 * principales) + Imprimir (debe imprimir sus datos personales y su puesto en la
 * empresa). + Dar de alta un nuevo cliente. + Dar de baja un cliente. + Cambiar
 * de coche.
 */
public class Vendedor extends Empleado {

	private Coche coche;
	private String movil;
	private String area;
	private double comision;
	private Cliente cartera[] = new Cliente[10];
	static double incremento = 0.10;

	/* constructor por defecto */
	public Vendedor(String nombre, String apellidos, String dNI, String direccion, String telefono, Double salario,
			Coche coche, String movil, String area, double comision, Cliente[] clientes) {
		super(nombre, apellidos, dNI, direccion, telefono, salario);
		this.coche = coche;
		this.movil = movil;
		this.area = area;
		this.comision = comision;
		this.cartera = clientes;
	}

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

	public Cliente[] getClientes() {
		return cartera;
	}

	public void setClientes(Cliente[] clientes) {
		this.cartera = clientes;
	}

	@Override
	public String toString() {
		return "Vendedor [coche=" + coche + ", movil=" + movil + ", area=" + area + ", comision="
				+ comision + ", clientes=" + Arrays.toString(cartera) + "]"+ super.toString();
	}

	public void altaCliente(Cliente clientes []) {
		int j = Cliente.getSiguiente();
		if (Cliente.getSiguiente()>= clientes.length*0.8) {
			clientes = Arrays.copyOf(clientes, (int)(clientes.length*1.5));
		}
		clientes[Cliente.getSiguiente()] = introducirCliente();
		clientes[j].setVendedorAsignado(this);
		boolean nuevo = false;
		for (int i = 0; i < cartera.length && nuevo != true; i++) {
			if (cartera[i] == null) {
				cartera[i] = clientes [j];
				nuevo = true;
			} else if (cartera.length == i && cartera[i] != null) {
				cartera = Arrays.copyOf(cartera, cartera.length + 5);
			}
		}
	}

	public void bajaCliente(Cliente cliente, Cliente clientes[]) {
		for (int j = 0; j < cartera.length; j++) {
			if (cartera[j].equals(cliente)) {
				cartera[j]=null;
			}
		}
		for (int j = 0; j < clientes.length; j++) {
			if (clientes[j].equals(cliente)) {
				clientes[j].setBaja(true);
			}
		}
		//no se si tengo que dar de baja el cliente o solo quitarlo del vendedor
	}

	/**
	 * @param i
	 */
	public Cliente introducirCliente() {
		String nombre = Leer.pedirCadena("introduzca el nombre del cliente");
		Cliente cliente = new Cliente(nombre);
		return cliente;
	}

	public double calcularNomnina() {
		double nomina = super.getSalarioBase()*(1+super.getAntiguedad()*incremento);
		return nomina;
	}
}
