import java.util.Arrays;

import utilidades.Fecha;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado vector[] = new Empleado[20];
		Fecha sysdate = new Fecha(19, 02, 2018);
		int menu = -1;
		introducirDatos(vector);
		do {
			Leer.mostrarEnPantalla("1. Crear Responsable");
			Leer.mostrarEnPantalla("2. Crear Administrativo");
			Leer.mostrarEnPantalla("3. Crear Tecnico");
			Leer.mostrarEnPantalla("4. Listar Plantilla");
			Leer.mostrarEnPantalla("5. Listar nominias");
			Leer.mostrarEnPantalla("6. Establecer salario base");
			Leer.mostrarEnPantalla("7. Establecer plus de responsabilidad");
			Leer.mostrarEnPantalla("");
			menu = Leer.pedirEntero("introduzca Una opcion de menu");
			switch (menu) {
			case 1:
				introducirResponsable(vector);

				break;
			case 2:
				introducirAdministrativo(vector);
				break;
			case 3:
				introducirTecnico(vector);
				break;
			case 4:
				Leer.mostrarEnPantalla(Arrays.toString(vector));
				break;
			case 5:
				for (int i = 0; i < vector.length; i++) {
					if (vector[i] != null) {
						System.out.println(i + " " + vector[i].getNombre() + " " + vector[i].calculoNomina(sysdate));
					}
				}
				break;
			case 6:
				Empleado.setSalario_base(Leer.pedirFloat("Introduzca salario base."));
				break;
			case 7:
				Responsable.setPlusResponsabilidad(Leer.pedirFloat("introduce el plus de responsabilidad"));
				break;
			default:
				break;
			}
		} while (menu != 0);

	}

	/**
	 * @param vector
	 */
	public static void introducirResponsable(Empleado[] vector) {
		String nombre = Leer.pedirCadena("introduzca nombre");
		int dia = Leer.pedirEntero("introducir Dia");
		int mes = Leer.pedirEntero("introducir mes");
		int anyo = Leer.pedirEntero("introducir año");
		Fecha fecha_nacimiento = new Fecha(dia, mes, anyo);
		dia = Leer.pedirEntero("introducir Dia");
		mes = Leer.pedirEntero("introducir mes");
		anyo = Leer.pedirEntero("introducir año");
		Fecha fechaIngreso = new Fecha(dia, mes, anyo);
		float bono = Leer.pedirFloat("introducir bono");
		String departamento = Leer.pedirCadena("Introduzca el departamento");
		vector[Empleado.getSiguiente()] = new Responsable(nombre, fecha_nacimiento, fechaIngreso, bono, departamento);
	}

	public static void introducirTecnico(Empleado[] vector) {
		String nombre = Leer.pedirCadena("introduzca nombre");
		int dia = Leer.pedirEntero("introducir Dia");
		int mes = Leer.pedirEntero("introducir mes");
		int anyo = Leer.pedirEntero("introducir año");
		Fecha fecha_nacimiento = new Fecha(dia, mes, anyo);
		dia = Leer.pedirEntero("introducir Dia");
		mes = Leer.pedirEntero("introducir mes");
		anyo = Leer.pedirEntero("introducir año");
		Fecha fechaIngreso = new Fecha(dia, mes, anyo);
		float plusEspecialidad = Leer.pedirFloat("introducir bono");
		String especialidad = Leer.pedirCadena("Introduzca el departamento");

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Responsable) {
				System.out.print(i + "  ");
				System.out.println(vector[i].getNombre());
			}
		}
		int i = Leer.pedirEntero("introduzca el responsable");
		do {
			i = Leer.pedirEntero("introduzca el responsable");
		} while ((vector[i] instanceof Responsable) == false);
		vector[Empleado.getSiguiente()] = new Tecnico(nombre, fecha_nacimiento, fechaIngreso, especialidad,
				plusEspecialidad, (Responsable) vector[i]);
	}

	public static void introducirAdministrativo(Empleado[] vector) {
		String nombre = Leer.pedirCadena("introduzca nombre");
		int dia = Leer.pedirEntero("introducir Dia");
		int mes = Leer.pedirEntero("introducir mes");
		int anyo = Leer.pedirEntero("introducir año");
		Fecha fecha_nacimiento = new Fecha(dia, mes, anyo);
		dia = Leer.pedirEntero("introducir Dia");
		mes = Leer.pedirEntero("introducir mes");
		anyo = Leer.pedirEntero("introducir año");
		Fecha fechaIngreso = new Fecha(dia, mes, anyo);
		String departamento = Leer.pedirCadena("Introduzca el departamento");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Administrativo) {
				System.out.print(i + "  ");
				System.out.println(vector[i].getNombre());
			}
		}
		int i = Leer.pedirEntero("introduzca el responsable");
		vector[Empleado.getSiguiente()] = new Administrativo(nombre, fecha_nacimiento, fechaIngreso, departamento,
				(Responsable) vector[i]);
	}

	public static void introducirDatos(Empleado vector[]) {

		vector[Empleado.getSiguiente()] = new Responsable("Lucia", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000),
				200.f, "Marketing");
		vector[Empleado.getSiguiente()] = new Responsable("Javier", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000),
				200.f, "Marketing");
		vector[Empleado.getSiguiente()] = new Tecnico("Juan", new Fecha(2, 03, 1997), new Fecha(02, 05, 2000),
				"marketing", (float) 800, (Responsable) vector[1]);
		vector[Empleado.getSiguiente()] = new Tecnico("Julian", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000),
				"Produccion", 200.f, (Responsable) vector[1]);
		vector[Empleado.getSiguiente()] = new Tecnico("Pedro", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000),
				"Produccion", 200.f, (Responsable) vector[1]);
		vector[Empleado.getSiguiente()] = new Tecnico("Anis", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000),
				"Produccion", 200.f, (Responsable) vector[1]);
		vector[Empleado.getSiguiente()] = new Administrativo("Francisco", new Fecha(18, 05, 1998),
				new Fecha(18, 05, 1998), "Recoleccion", (Responsable) vector[0]);
		vector[Empleado.getSiguiente()] = new Administrativo("Marta", new Fecha(18, 05, 1998), new Fecha(18, 05, 1998),
				"Recoleccion", (Responsable) vector[0]);

	}
}
