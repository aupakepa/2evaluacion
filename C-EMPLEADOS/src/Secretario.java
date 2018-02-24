/**2. Secretario. Tiene despacho, número de fax e incrementa su salario un 5%
anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).*/
public class Secretario extends Empleado{
	
private String despacho;
private String fax;
static double incremento=1.05;

public String getDespacho() {
	return despacho;
}
public void setDespacho(String despacho) {
	this.despacho = despacho;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}

@Override
public String toString() {
	return  "Secretario [despacho=" + despacho + ", fax=" + fax + "]"+super.toString();
}

public Secretario(String nombre, String apellidos, String dNI, String direccion, String telefono, Double salario,
		String despacho, String fax) {
	super(nombre, apellidos, dNI, direccion, telefono, salario);
	this.despacho = despacho;
	this.fax = fax;
}
public double calcularNomnina() {
	double nomina = super.getSalarioBase()*super.getAntiguedad()*incremento;
	return nomina;
}

}
