package Prueba;

public class Empleado {
private String nombre;
private double sueldo;
@Override
public String toString() {
	return "Empleado [empleado=" + nombre + ", sueldo=" + sueldo + "]"+"\n";
}
public Empleado(String empleado, double sueldo) {
	super();
	this.nombre = empleado;
	this.sueldo = sueldo;
}
public String getEmpleado() {
	return nombre;
}
public void setNombre(String empleado) {
	this.nombre = empleado;
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
}
