package Prueba;

import java.util.Arrays;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleados[] = new Empleado[10];
		empleados[0] = new Jefe("javier", 20000, "Director Produccion", "Produccion");
		empleados[1] = new Jefe("javier", 20000, "Director Produccion", "Produccion");
		empleados[2] = new Jefe("pilar", 25000, "jefe_RRHH", "RRHH");
		empleados[3] = new Empleado("Juan", 50000);
		empleados[4] = new Empleado("Juan", 50000);

		Leer.mostrarEnPantalla(Arrays.toString(empleados));
	}

}
