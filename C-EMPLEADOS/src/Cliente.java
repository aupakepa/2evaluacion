
public class Cliente {
private String nombre;
static Integer siguiente = 43000001;
private Integer numero;
private boolean baja ;
/**
 * @param nombre
 * @param numero
 */
public Cliente(String nombre) {
	this.nombre = nombre;
	this.numero = siguiente;
	this.baja = false;
	siguiente++;
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
