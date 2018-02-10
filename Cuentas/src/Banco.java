public class Banco {
	private String numCuenta;
	private double saldo;
	private String nombre;
	private static Integer contador = 1;
	private static Integer activas = 0;
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
		activas++;
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
	public void cancelar (){
		this.saldo=0;
		nombre = "CERRADA".concat(nombre);
		activas--;
	}
	public Banco fusion(Banco cuenta2){
		double saldo;
		Banco cuenta;
		if (!this.numCuenta.equals(cuenta2.getNumCuenta()) && this.nombre.equals(cuenta2.getNombre())) {
		saldo = this.saldo + cuenta2.getSaldo();
		cuenta = new Banco(saldo, this.nombre);
		this.cancelar();
		cuenta2.cancelar();
		return cuenta;
		}
		else {
		return null;
		}
	}
}

