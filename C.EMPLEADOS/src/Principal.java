import utilidades.Leer;

/**C.- Ejercicio de Herencia y Polimorfismo: EMPLEADOS
Se pretende desarrollar un conjunto de clases que representen, de forma simplificada, a
una hipotética empresa dedicada a vender un producto. A continuación, se describen las
características básicas de estas clases:

1. Empleado. Clase básica que describe a un empleado. Incluye sus datos
personales (nombre, apellidos, DNI, dirección) y algunos datos tales como los
años de antigüedad, teléfono de contacto y su salario.
Incluye también información de quién es el empleado que lo supervisa
(Empleado *). Tendrá, al menos, las siguientes funciones miembro:
• Constructores para definir correctamente un empleado, a partir de su nombre,
apellidos, DNI, dirección, teléfono y salario.
• Imprimir (A través de los operadores de E/S redefinidos)
• Cambiar supervisor
• Incrementar salario

2. Secretario. Tiene despacho, número de fax e incrementa su salario un 5%
anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).

3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca y
modelo), teléfono móvil, área de venta, lista de clientes y porcentaje que se lleva
de las ventas en concepto de comisiones. Incrementa su salario un 10% anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Dar de alta un nuevo cliente.
• Dar de baja un cliente.
• Cambiar de coche.

4. Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de
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

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleados[] = new Empleado[12];
		Coche coches[] = new Coche[12];
		Cliente clientes[] = new Cliente[12];
		Integer menu = -1;
		datosIniciales(empleados, coches, clientes);
		do {
			menu = opcionesMenu();
			switch (menu) {
			case 0:

				break;

			case 1:
				listarPorTipo(empleados);

				break;

			case 2:
				for (int i = 0; empleados[i] != null && i < empleados.length; i++) {
					double sueldo = empleados[i].calcularNomnina();
					Leer.mostrarEnPantalla(empleados[i].getApellidos() + " sueldo= " + sueldo);
				}
				break;

			case 3:
				Integer i = seleccionarVendedor(empleados);
				if (empleados[i] instanceof Vendedor) {
					((Vendedor)empleados [i]).altaCliente(clientes);
				}
				break;

			case 4:
				for (int j = 0; clientes != null && j < clientes.length; j++) {
					Leer.mostrarEnPantalla(j+".- "+clientes[j].getNombre());
				}
				int k = Leer.pedirEntero("introduzca el cliente a dar de baja");
				int j = seleccionarVendedor(empleados);
				((Vendedor)empleados[j]).bajaCliente(clientes[k], clientes);
				break;

			case 5:
				for (int j2 = 0; j2 < clientes.length; j2++) {
					if (clientes[j2] != null) {
						Leer.mostrarEnPantalla(j2+".- "+ clientes[j2].getNumero()+" "+clientes[j2].getNombre()+" vendedor = " +clientes[j2].getVendedorAsignado().getApellidos());
					}
				}
				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			default:
				break;
			}
		} while (menu != 0);

	}

	/**
	 * @param empleados
	 * @return
	 */
	public static Integer seleccionarVendedor(Empleado[] empleados) {
		listarVendedor(empleados);
		Integer i = Leer.pedirEntero("seleccione el vendedor a asignar");
		return i;
	}

	/**
	 * @param empleados
	 */
	public static void listarPorTipo(Empleado[] empleados) {
		int tipo;
		do {
			Leer.mostrarEnPantalla("1. Vendedores");
			Leer.mostrarEnPantalla("2. Secretarios");
			Leer.mostrarEnPantalla("3. Jefe de Zona");
			Leer.mostrarEnPantalla("0. Salir");
			tipo = Leer.pedirEntero("introduzca el tipo");
			switch (tipo) {
			case 1:
				listarVendedor(empleados);
				break;

			case 2:
				listarSecretarios(empleados);
				
				break;

			case 3:
				listarJefeZona(empleados);
				break;

			case 4:

				break;

			default:
				break;
			}
		} while (tipo != 0);
	}

	/**
	 * @param empleados
	 */
	public static void listarJefeZona(Empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof JefeZona) {
				Leer.mostrarEnPantalla(i+".- "+empleados[i].toString());
			}
		}
	}

	/**
	 * @param empleados
	 */
	public static void listarSecretarios(Empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
		if (empleados[i] instanceof Secretario) {
			Leer.mostrarEnPantalla(i+".- "+empleados[i].toString());
		}
}
	}

	/**
	 * @param empleados
	 */
	public static void listarVendedor(Empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Vendedor) {
				Leer.mostrarEnPantalla(i+".- "+empleados[i].toString());
			}
		}
	}

	/**
	 * @return
	 */
	public static Integer opcionesMenu() {
		Integer menu;
		Leer.mostrarEnPantalla("\n1.- Mostrar por puesto");
		Leer.mostrarEnPantalla("2.- Calcular Nominas");
		Leer.mostrarEnPantalla("3.- Dar de alta un cliente");
		Leer.mostrarEnPantalla("4.- Dar de baja un cliente");
		Leer.mostrarEnPantalla("5.- Listar clientes");
		Leer.mostrarEnPantalla("6.- Cambiar coche");
		Leer.mostrarEnPantalla("7.- Asignar un secretario");
		Leer.mostrarEnPantalla("8.- Asignar un vendedor al Jefe de Zona");
		Leer.mostrarEnPantalla("9.- Crear un empleado");
		Leer.mostrarEnPantalla("0.- Salir");
		menu = Leer.pedirEntero("-------------------------------------------\nintroduzca una opcion de menu");
		return menu;
	}

	/**
	 * @param empleados
	 * @param coches
	 * @param clientes
	 */
	public static void datosIniciales(Empleado[] empleados, Coche[] coches, Cliente[] clientes) {
		coches[0] = new Coche("seat", "3023DWT", "altea");
		coches[1] = new Coche("rover", "3023DWT", "evoque");
		coches[2] = new Coche("seat", "3023DWT", "Ateca");
		coches[3] = new Coche("nissan", "3023DWT", "qascai");
		coches[4] = new Coche("audi", "3023DWT", "A4");
		coches[5] = new Coche("seat", "3023DWT", "altea");

		clientes[0] = new Cliente("Monforte");
		clientes[1] = new Cliente("taboada");
		clientes[2] = new Cliente("jimenez");
		clientes[3] = new Cliente("mercado");
		clientes[4] = new Cliente("bernal");
		clientes[6] = new Cliente("chamorro");
		clientes[5] = new Cliente("notivol");
		clientes[7] = new Cliente("bezares");
		clientes[8] = new Cliente("chasco");
		clientes[9] = new Cliente("martinez");
		clientes[10] = new Cliente("santamaria");
		clientes[11] = new Cliente("embrum");

		Cliente cartera[] = new Cliente[4];
		cartera[0] = clientes[0];
		cartera[1] = clientes[1];
		cartera[2] = clientes[2];
		cartera[3] = clientes[3];
		Cliente cartera2[] = new Cliente[4];
		cartera2[0] = clientes[4];
		cartera2[1] = clientes[5];
		cartera2[2] = clientes[6];
		cartera2[3] = clientes[7];
		Cliente cartera3[] = new Cliente[4];
		cartera3[0] = clientes[8];
		cartera3[1] = clientes[9];
		cartera3[2] = clientes[10];
		cartera3[3] = clientes[11];
		empleados[Empleado.getSiguiente()] = new Secretario("Pepe", "Lopez", "25987252", "su casa", "976582645",
				1000.25, "100A", "976582643");
		empleados[Empleado.getSiguiente()] = new Secretario("Felipe", "Perez", "25987252", "su casa", "976582645",
				1000.25, "200A", "976582643");
		empleados[Empleado.getSiguiente()] = new Secretario("Juan", "Garcia", "25987252", "su casa", "976582645",
				1000.25, "300A", "976582643");
		empleados[Empleado.getSiguiente()] = new Secretario("Javier", "Martinez", "25987252", "su casa", "976582645",
				1000.25, "400A", "976582643");
		empleados[Empleado.getSiguiente()] = new Vendedor("Javier", "Monforte", "25987252", "su casa", "976582645",
				1000.25, coches[0], "66534283", "ZONA1", 0.05, cartera);
		empleados[Empleado.getSiguiente()] = new Vendedor("Juan", "Martinez", "25987252", "su casa", "976582645",
				1000.25, coches[1], "66534283", "ZONA2", 0.05, cartera2);
		empleados[Empleado.getSiguiente()] = new Vendedor("Silvia", "Pallares", "38987252", "su casa", "976582645",
				1000.25, coches[2], "66534283", "ZONA3", 0.05, cartera3);

		Vendedor equipo[] = new Vendedor[5];
		equipo[0] = (Vendedor) empleados[4];
		equipo[1] = (Vendedor) empleados[5];

		Vendedor equipo2[] = new Vendedor[5];
		equipo2[0] = (Vendedor) empleados[6];

		empleados[Empleado.getSiguiente()] = new JefeZona("Silvia", "Pallares", "38987252", "su casa", "976582645",
				1000.25, "300B", (Secretario) empleados[1], coches[3], equipo);
		empleados[Empleado.getSiguiente()] = new JefeZona("Silvia", "Pallares", "38987252", "su casa", "976582645",
				1000.25, "301B", (Secretario) empleados[0], coches[4], equipo2);
		
		clientes[0].setVendedorAsignado((Vendedor)empleados[4]);
		clientes[1].setVendedorAsignado((Vendedor)empleados[4]);
		clientes[2].setVendedorAsignado((Vendedor)empleados[4]);
		clientes[3].setVendedorAsignado((Vendedor)empleados[4]);
		clientes[4].setVendedorAsignado((Vendedor)empleados[5]);
		clientes[5].setVendedorAsignado((Vendedor)empleados[5]);
		clientes[6].setVendedorAsignado((Vendedor)empleados[5]);
		clientes[7].setVendedorAsignado((Vendedor)empleados[5]);
		clientes[8].setVendedorAsignado((Vendedor)empleados[6]);
		clientes[9].setVendedorAsignado((Vendedor)empleados[6]);
		clientes[10].setVendedorAsignado((Vendedor)empleados[6]);
		clientes[11].setVendedorAsignado((Vendedor)empleados[6]);

	}

}
