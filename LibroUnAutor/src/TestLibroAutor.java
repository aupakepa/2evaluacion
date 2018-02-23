import java.util.Arrays;

import utilidades.Fecha;
import utilidades.Leer;

/**3)	Crea el proyecto LibroUnAutor, que estará formado por las siguientes clases:
*Autor
*-nombre: String (no tiene valor por defecto)
*-email:  String (no tiene valor por defecto)
*-sexo: char (los posibles valores son ‘m’ o ‘f’)
*-fechaNacimiento: Fecha
*+Autor(nombre: String, email: String, genero: String)
*+getNombre(): String
*+getEmail: String
*+setEmail(email: String): void
*+getSexo(): char
*+toString(): String

*El método toString devolverá la siguiente cadena de caracteres (por ejemplo):
*"Autor[nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954]"
*
*Libro
*-titulo: String (no tiene valor por defecto)
*-autor:  Autor
*-precio: Double
*-cantidad: Integer = 0
*+Libro(String titulo, Autor autor, Double precio)
*+Libro(String titulo, Autor autor, Double precio,
             Integer cantidad)
*+getTitulo(): String
*+getAutor: Autor
*+getPrecio(): Double
*+setPrecio (precio: double): void
*+getCantidad(): Integer
*+setCantidad(cantidad: int): void
*+toString(): String
*
*Supondremos que un libro sólo tiene un autor y que el método toString devolverá una cadena de caracteres como la siguiente (por ejemplo):
*“Libro [titulo = El asedio,
*Autor [nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954]  
*precio = 18,90 
*cantidad = 3]”
*Escribe la clase TestLibroAutor, que además del método main deberá tener otros métodos estáticos para que al ejecutar la aplicación muestre un menú con las siguientes opciones:
*1- Crear libros. (Esta opción preguntará al usuario cuántos libros quiere crear y a continuación procederá a instanciarlos)
*2- Modificar autor.
*3- Modificar libro.
*4- Listado de libros.
*5- Listado de autores.
*0- Salir.*/

public class TestLibroAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libros[] = new Libro[10];
		Autor autores[] = new Autor[10];
		variosAutores(autores);
		variosLibros(autores, libros);
		Integer menu = -1;

		do {
			Leer.mostrarEnPantalla("1.- Crear libros");
			Leer.mostrarEnPantalla("2- Modificar autor.");
			Leer.mostrarEnPantalla("3- Modificar libro.");
			Leer.mostrarEnPantalla("4- Listado de libros");
			Leer.mostrarEnPantalla("5- Listado de autores.");
			Leer.mostrarEnPantalla("0- Salir.");
			menu = Leer.pedirEntero("Introduzca una opcion de menu");
			switch (menu) {
			case 1:

				// crear libro
				libros = introducirLibro(libros, autores);

				break;

			case 2:
				modificarAutor(autores);
				break;

			case 3:
				mostrarLibros(libros);
				modificarLibro(libros, autores);
			

				break;

			case 4:
				Leer.mostrarEnPantalla(Arrays.toString(libros));
				break;

			case 5:
				Leer.mostrarEnPantalla(Arrays.toString(autores));
				break;

			case 0:

				break;

			default:
				break;
		}	
		
} while (menu != 0);
}
	/**
	 * @param libros
	 * @param autores
	 */
	public static void modificarLibro(Libro[] libros, Autor[] autores) {
		Leer.mostrarEnPantalla("introduzca id del libro a modificar");
		Integer i = Leer.pedirEntero("id");
		Integer opc = -1;
		do {
			libros[i].toString();
			Leer.mostrarEnPantalla("1. Modificar titulo");
			Leer.mostrarEnPantalla("2. Modificar cantidad");
			Leer.mostrarEnPantalla("3. Modificar precio");
			Leer.mostrarEnPantalla("4. Modificar autor");
			Leer.mostrarEnPantalla("0. Salir");
			opc=Leer.pedirEntero("Introduzca una opcion");
			switch (opc) {
			case 1:
				String titulo = Leer.pedirCadena("introduzca el nuevo titulo");
				libros[i].setTitulo(titulo);
				break;

			case 2:
				Integer cantidad = Leer.pedirEntero("introducir cantidad");
				libros[i].setCantidad(cantidad);
				break;

			case 3:
				double precio = Leer.pedirDouble("introduzca precio");
				libros[i].setPrecio(precio);
				break;

			case 4:
				Autor autor = autores[seleccionarAutor(autores)];
				libros[i].setAutor(autor);
				break;
			case 0:

				break;

			default:
				break;
			}
		} while (opc != 0);
	}
	
	/**
	 * @param autores
	 */
	public static void modificarAutor(Autor[] autores) {
		Integer i = seleccionarAutor(autores);
		Integer opc = -1;
		do {
			autores[i].toString();
			Leer.mostrarEnPantalla("1. Modificar nombre");
			Leer.mostrarEnPantalla("2. Modificar email");
			Leer.mostrarEnPantalla("3. Modificar fechaNacimiento");
			Leer.mostrarEnPantalla("4. Modificar sexo");
			Leer.mostrarEnPantalla("0. Salir");
			opc = Leer.pedirEntero("opcion");
			switch (opc) {
			case 1:
				String nombre = Leer.pedirCadena("introduzca el nuevo nombre");
				autores[i].setNombre(nombre);
				break;
	
			case 2:
				String mail = Leer.pedirCadena("introduzca el nuevo mail");
				autores[i].setMail(mail);;
				break;
	
			case 3:
				Fecha fechaNacimiento = introducirFechaNacimiento();
				autores[i].setFechaNacimiento(fechaNacimiento);
				break;
	
			case 4:
				char sexo = introducirSexo();
				autores[i].setSexo(sexo);
				break;
			case 0:
	
				break;
	
			default:
				break;
			}
		} while (opc != 0);
	}
	/**
	 * @param libros
	 */
	public static void mostrarLibros(Libro[] libros) {
		for (int i = 0; i < libros.length && libros[i] != null; i++) {
		Leer.mostrarEnPantalla(i+".- "+libros[i].getTitulo());	
		}
	}

	/**
	 * @param autores
	 */
	public static void mostrarAutores(Autor[] autores) {
		for (int j = 0; j < autores.length && autores[j] != null; j++) {
			Leer.mostrarEnPantalla(j + ".- " + autores[j].getNombre());
		}
	}
	/**Introducir un libro desde cero en la siguiente posicion si esta lleno ampliarlo
	 * @param libros
	 * @param autores
	 * @return
	 */
	public static Libro[] introducirLibro(Libro[] libros, Autor[] autores) {
		String titulo = Leer.pedirCadena("introduce el titulo del libro");
		Double precio = Leer.pedirDouble("introduzca el precio del libro");
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = new Libro(titulo, autores[seleccionarAutor(autores)], precio);
			} else if (libros[i] != null && libros.length - 1 == i) {
				libros = Arrays.copyOf(libros, libros.length * 2);
			}
		}
		return libros;
	}

	/**Introducir autor en la siguente posicion del vector si llega al limite ampliarlo
	 * @param autores
	 * @return
	 */
	public static Autor[] introducirAutor(Autor[] autores) {
		String nombre = Leer.pedirCadena("introduzca el Nombre del Autor");
		String mail = Leer.pedirCadena("introduzca el mail del Autor");
		Fecha fechaNacimiento = introducirFechaNacimiento();
		char sexo = introducirSexo();
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] == null) {
				autores[i] = new Autor(nombre, mail, sexo, fechaNacimiento);
			} else if (autores[i] != null && autores.length - 1 == i) {
				autores = Arrays.copyOf(autores, autores.length * 2);
			}
		}
		return autores;
	}

	/**Introducir sexo como char y solo F O M
	 * @return
	 */
	public static char introducirSexo() {
		char sexo = Leer.pedirCadena("Introduzca F o M segun el sexo", "F|M").charAt(0);
		return sexo;
	}

	/**introducir una fecha de nacimiento
	 * @return
	 */
	public static Fecha introducirFechaNacimiento() {
		Integer dia = Leer.pedirEntero("introduzca el dia de la fecha de nacimiento");
		Integer mes = Leer.pedirEntero("introduzca el mes de la fecha de nacimiento");
		Integer anyo = Leer.pedirEntero("introduzca el año de la fecha de nacimiento");
		Fecha fechaNacimiento = new Fecha(dia, mes, anyo);
		return fechaNacimiento;
	}

	/** Seleccionar autor y si no existe crearlo
	 * @param autores
	 */
	public static Integer seleccionarAutor(Autor[] autores) {
		// seleccionar el autor
		String existe = "N";
		Integer i = -1;
		do {
			mostrarAutores(autores);
			existe = Leer.pedirCadena("esta el libro en la lista? S / N","S|N");

			if (existe.equals("N")) {
				introducirAutor(autores);
			} else if (existe.equals("S")) {
				i = Leer.pedirEntero("Seleccione el id del autor");
			}
		} while (i == -1);

		return i;
	}
	public static void variosAutores(Autor autores[]) {

		for (int i = 0; i < autores.length; i++) {
			if (i > autores.length / 2 && autores[i] != null) {
				autores = Arrays.copyOf(autores, autores.length + 10);
			}
		}

		autores[0] = new Autor("Millan kundera", "milan@fontecabras.es", 'M',
				new Fecha(24, 7, 1977));
		autores[1] = new Autor("J.R.R Tolkien", "JRR@fontecabras.es", 'F', new Fecha(23, 8, 1973));
		autores[2] = new Autor("Patrick Süskind", "patrick@fontecabras.es", 'M',
				new Fecha(24, 1, 1987));
		autores[3] = new Autor("Ken Follett", "patrick@fontecabras.es", 'M', new Fecha(01, 3, 1957));
		autores[4] = new Autor("Irvine Welsh", "patrick@fontecabras.es", 'M',
				new Fecha(28, 2, 1965));

	}
	public static void variosLibros(Autor autores[], Libro libros[]) {
		for (int i = 0; i < libros.length; i++) {
			if (i > libros.length / 2 && libros[i] != null) {
				libros = Arrays.copyOf(libros, libros.length + 10);
			}
		}

		libros[0] = new Libro("La insoportable levedad del ser", autores[0],10);
		libros[1] = new Libro("El señor de los anillos", autores[1],12);
		libros[2] = new Libro("El perfume", autores[2],13);
		libros[3] = new Libro("Trainspotting", autores[4],14);
		libros[4] = new Libro("El tercer gemelo", autores[3],15);
		libros[5] = new Libro("Los Pilares de la tierra", autores[3],16);
		libros[6] = new Libro("En la boca del dragón", autores[3],17);

	}	
}
