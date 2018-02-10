public class Banco {
	private String numCuenta;
	private double saldo;
	private String nombre;
	private static Integer contador = 1;
	public static Integer getCuentasActivas() {
		return cuentasActivas;
	}
	public static void setCuentasActivas(Integer cuentasActivas) {
		Banco.cuentasActivas = cuentasActivas;
	}
	private static Integer cuentasActivas = 0;
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Integer getContador() {
		return contador;
	}
	public static void setContador(Integer contador) {
		Banco.contador = contador;
	}
	@Override
	public String toString() {
		return "Banco [numCuenta=" + numCuenta + ", saldo=" + saldo + ", nombre=" + nombre + "]";
	}
	public Banco(double saldo, String nombre) {
		this.saldo = saldo;
		this.numCuenta = nombre;
		this.nombre = nombre;
		contador++;
		cuentasActivas++;
		}
	public void ingresaEfectivo(double cantidad){
		this.saldo = this.saldo + cantidad;
	}
	public boolean retiraEfectivo(double cantidad){
		boolean confirmacion;
		if (this.saldo - cantidad > 0 ) {
			this.saldo= this.saldo - cantidad;
			confirmacion = true;
		}
		else {
			confirmacion = false;
		}
		return confirmacion;
	}
	public String visualizar(){
		String visual;
		visual = "Numero de Cuenta "+numCuenta+" saldo "+saldo;
		return visual;
	}
	public void cerrarCuenta(){
		this.nombre= this.nombre.concat("cerrada");
		cuentasActivas--;
		this.saldo=0;
	}
	public Banco fusionCuentas(Banco cuenta2){
	double nuevoSaldo;
	Banco cuenta = null;
	String name;
	if (this.nombre.equals(cuenta2.nombre)) {
		cuenta=null;
	}
	else if (this.numCuenta.equals(cuenta2.numCuenta)) {
		cuenta=null;
	}
	else {
		nuevoSaldo = this.saldo + cuenta2.getSaldo();
		name = this.nombre;
		cuenta = new Banco(nuevoSaldo,name);
		this.cerrarCuenta();
		cuenta2.cerrarCuenta();
	}
	return cuenta;
	}
}

