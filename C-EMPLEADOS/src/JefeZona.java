import java.util.Arrays;

/**4. Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de
vendedores a su cargo y tiene coche de la empresa (identificado por la matrícula,
marca y modelo). Incrementa su salario un 20% anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Cambiar de secretario.
• Cambiar de coche.
• Dar de alta y de baja un nuevo vendedor en su zona.
Todos los empleados son vendedores, jefes de zona o secretarios. Hacer un programa
de prueba que muestre como funciona. Probar, especialmente, que el método
incrementar salario se comparta bien, según el empleado que sea así es la subida.*/
public class JefeZona extends Empleado {
private String despacho;
private Secretario secretarioAsignado;
private Coche coche;
private  Vendedor vendedores [];
static double incremento = 1.20;

/**
 * @param nombre
 * @param apellidos
 * @param dNI
 * @param direccion
 * @param telefono
 * @param salarioBase
 * @param despacho
 * @param secretarioAsignado
 * @param coche
 * @param vendedores
 */
public JefeZona(String nombre, String apellidos, String dNI, String direccion, String telefono, Double salario,
		String despacho, Secretario secretarioAsignado, Coche coche, Vendedor[] vendedores) {
	super(nombre, apellidos, dNI, direccion, telefono, salario);
	this.despacho = despacho;
	this.secretarioAsignado = secretarioAsignado;
	this.coche = coche;
	this.vendedores = vendedores;
}
public String getDespacho() {
	return despacho;
}
public void setDespacho(String despacho) {
	this.despacho = despacho;
}
public Secretario getSecretarioAsignado() {
	return secretarioAsignado;
}
public void setSecretarioAsignado(Secretario secretarioAsignado) {
	this.secretarioAsignado = secretarioAsignado;
}
public Coche getCoche() {
	return coche;
}
public void setCoche(Coche coche) {
	this.coche = coche;
}
public Vendedor[] getVendedores() {
	return vendedores;
}
public void setVendedores(Vendedor[] vendedores) {
	this.vendedores = vendedores;
}
@Override
public String toString() {
	return "JefeZona [despacho=" + despacho + ", secretarioAsignado=" + secretarioAsignado.getApellidos() + ", coche=" + coche
			+ ", vendedores=" + Arrays.toString(vendedores) + "]";
}
public void altaVendedor(Vendedor vendedor) {
	for (int i = 0; i < vendedores.length; i++) {
		if (vendedores[i] == null) {
			vendedores[i]=vendedor;
		} else if (vendedores.length == i && vendedores[i] != null) {
			vendedores = Arrays.copyOf(vendedores, vendedores.length + 5);
		}
	}
}

public void bajaVendedor(int i) {
	vendedores[i] = null;
}
public double calcularNomnina() {
	double nomina = super.getSalarioBase()*super.getAntiguedad()*incremento;
	return nomina;
}
}
