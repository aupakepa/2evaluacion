
public class Cliente {
private String nombre;
static Integer siguiente = 0;
private Integer numero;
private boolean baja ;
private Vendedor vendedorAsignado;
/**
 * @param nombre
 * @param numero
 */
public Cliente(String nombre) {
	this.nombre = nombre;
	this.numero = 43000000+siguiente;
	this.baja = false;
	siguiente++;
}
public Vendedor getVendedorAsignado() {
	return vendedorAsignado;
}
public void setVendedorAsignado(Vendedor vendedorAsignado) {
	this.vendedorAsignado = vendedorAsignado;
}
public boolean isBaja() {
	return baja;
}
public void setBaja(boolean baja) {
	this.baja = baja;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public static Integer getSiguiente() {
	return siguiente;
}
public static void setSiguiente(Integer siguiente) {
	Cliente.siguiente = siguiente;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}
@Override
public String toString() {
	return "Cliente [nombre=" + nombre + ", numero=" + numero + "]";
}

}
