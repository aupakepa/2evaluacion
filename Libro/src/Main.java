import java.util.Arrays;
import utilidades.Leer;

/**
 * 3) Crea el proyecto LibroUnAutor, que estará formado por las siguientes
 * clases: Autor -nombre: String (no tiene valor por defecto) -email: String (no
 * tiene valor por defecto) -sexo: char (los posibles valores son ‘m’ o ‘f’)
 * -fechaNacimiento: Fecha +Autor(nombre: String, email: String, genero: String)
 * +getNombre(): String +getEmail: String +setEmail(email: String): void
 * +getSexo(): char +toString(): String
 * 
 * El método toString devolverá la siguiente cadena de caracteres (por ejemplo):
 * "Autor[nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m,
 * fechaNacimiento = 16-03-1954]"
 * 
 * Libro -titulo: String (no tiene valor por defecto) -autor: Autor -precio:
 * Double -cantidad: Integer = 0 +Libro(String titulo, Autor autor, Double
 * precio) +Libro(String titulo, Autor autor, Double precio, Integer cantidad)
 * +getTitulo(): String +getAutor: Autor +getPrecio(): Double +setPrecio
 * (precio: double): void +getCantidad(): Integer +setCantidad(cantidad: int):
 * void +toString(): String
 * 
 * Supondremos que un libro sólo tiene un autor y que el método toString
 * devolverá una cadena de caracteres como la siguiente (por ejemplo): “Libro
 * [titulo = El asedio, Autor [nombre = Arturo Perez Reverte, email =
 * apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954] precio = 18,90
 * cantidad = 3]” Escribe la clase TestLibroAutor, que además del método main
 * deberá tener otros métodos estáticos para que al ejecutar la aplicación
 * muestre un menú con las siguientes opciones: 1- Crear libros. (Esta opción
 * preguntará al usuario cuántos libros quiere crear y a continuación procederá
 * a instanciarlos) 2- Modificar autor. 3- Modificar libro. 4- Listado de
 * libros. 5- Listado de autores. 0- Salir.
 * 
 * 4) Crea un nuevo proyecto, al que llamarás LibroVariosAutores que utilice las
 * clases del ejercicio anterior y modifica la clase Libro para que un libro
 * pueda tener varios autores. El método toString debe devolver, por ejemplo:
 * “Libro [titulo = Cuentan que cuentan { Autor [nombre = Silvia Schujer, email
 * = schujer@correo.com, genero = f, fechaNacimiento = 16-03-1954 ], [Laura
 * Devetach, ldevet@edu.com, genero = f, fechaNacimiento = 16-03-1954], [Emma
 * Wolf, wolf@correo.com , genero = f, fechaNacimiento = 16-03-1954]} precio =
 * 14 cantidad = 6]”
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libros[] = new Libro[10];
		Autor autores[] = new Autor[10];
		variosAutores(autores);
		variosLibros(autores, libros);
		int menu = -1;
		do {
			System.out.println("1- Crear libros.");
			System.out.println("2- Modificar libro");
			System.out.println("3- Modificar autor");
			System.out.println("4- Listado de libros");
			System.out.println("5- Listado de autores");
			System.out.println("6- Crear Varios Libros y Autores");
			System.out.println("7- Introducir Autor");
			System.out.println("0- Salir");
			menu = Leer.pedirEntero("introduzca una opcion de menu");
			switch (menu) {
			case 1://1- Crear libros.
				int numero = Leer.pedirEntero("Cuantos libros quieres crear");
				for (int i = 0; i <= libros.length && numero != 0; i++) {
					if (libros[i] == null && i == libros.length - 1) {
						libros = Arrays.copyOf(libros, libros.length + 10);
					} else if (libros[i] == null) {
						introducirLibros(autores,libros);
						numero--;
					}
				}
				break;
			case 2://2- Modificar libro
				mostrarTitulos(libros);
				int idlibro = Leer.pedirEntero("selecciona el libro a modificar");
				modificarLibro(libros, autores, idlibro);
				break;
			case 3://3- Modificar autor
				mostrarListaAutores(autores);
				int i = Leer.pedirEntero("elija el autor a modificar");
				modificarAutor(autores, i);
				break;
			case 4://4- Listado de libros
					Leer.mostrarEnPantalla(Arrays.toString(libros));

				break;
			case 5://5- Listado de autores
				Leer.mostrarEnPantalla(Arrays.toString(autores));
				break;
			case 6:  //6- Crear Varios Libros y Autores
				autores=variosAutores(autores);
				libros=variosLibros(autores,libros);
				break;
			case 0://salir

				break;
			case 7://"7- Introducir Autor"
				 autores=introducirAutor(autores);
				
				break;

			default:
				break;
			}
		} while (menu != 0);

	}

	public static void buscarlibro(Autor autores[], Libro[] libros) {
		String cadena = Leer.pedirCadena("Busca un libro");
		for (int i = 0; (i < libros.length) && (libros[i] != null); i++) {
			if (libros[i].getTitulo().indexOf(cadena) != -1) {
			Leer.mostrarEnPantalla("hemos encontrado tu libro");
			Leer.mostrarEnPantalla(i+libros[i].toString());
			Leer.mostrarEnPantalla("modifica el libro");
			libros = introducirLibros(autores,libros);
			Leer.mostrarEnPantalla(i+libros[i].toString());
			}
		}
	}

	/**
	 * @param autor
	 * @param libros
	 */
	public static Libro[] modificarLibro(Libro libros[],Autor autores[],int i) {
			int opc=-1;
			
			mostrarTitulos(libros);
			do {
				Leer.mostrarEnPantalla("1.Modifica el titulo");
				Leer.mostrarEnPantalla("2.Modifica el precio");
				Leer.mostrarEnPantalla("3.Modifica el cantidad");
				Leer.mostrarEnPantalla("4.Modifica autor");
				Leer.mostrarEnPantalla("0.salir");
				opc=Leer.pedirEntero("Que campo quieres modificar");
				switch (opc) {
				case 1:
					libros[i].setTitulo(Leer.pedirCadena("introduce el nuevo nombre"));
					break;
				case 2:
					libros[i].setPrecio(Leer.pedirDouble("introduce el nuevo precio"));

					break;
				case 3:
					libros[i].setCantidad(Leer.pedirEntero("introduce el nuevo precio"));

					break;
				case 4:
					int numeroAutores = Leer.pedirEntero("introduce el numero de autores");
					seleccionarAutor(autores, numeroAutores, libros);
					libros[i].setAutor(seleccionarAutor(autores, numeroAutores, libros));
					break;
				case 0:
					Leer.mostrarEnPantalla("Fin de modificar Libro");
					break;

				default:
					break;
				}
			} while (opc!=0);
			
		return libros;
	}

	public static Autor[] modificarAutor (Autor autores[],int i) {
		int opc=-1;
		do {
			Leer.mostrarEnPantalla("1.Modifica el nombre");
			Leer.mostrarEnPantalla("2.Modifica el email");
			Leer.mostrarEnPantalla("3.Modifica el sexo");
			Leer.mostrarEnPantalla("4.Modifica la fecha de nacimiento");
			Leer.mostrarEnPantalla("0.salir");
			opc=Leer.pedirEntero("Que campo quieres modificar");
			switch (opc) {
			case 1:
				Leer.mostrarEnPantalla(autores[i].getNombre());
				autores[i].setNombre(Leer.pedirCadena("introduce el nuevo nombre"));
				
				break;
			case 2:
				Leer.mostrarEnPantalla(autores[i].getEmail());
				autores[i].setEmail(Leer.pedirCadena("introduce el nuevo nombre"));
				break;
			case 3:
				Leer.mostrarEnPantalla(autores[i].getSexo()+"");
				autores[i].setSexo(Leer.pedirCadena("introduce el nuevo nombre").charAt(0));
				break;
			case 4:
				autores[i].getFechaNacimiento().toString();
				autores[i].setFechaNacimiento(IntroducirFecha());
				break;
			case 0:
	
				break;
	
			default:
				break;
			}
		} while (opc!=0);
		
		return autores;
	}

	private static void mostrarTitulos(Libro[] libros) {
		for (int j = 0; j < libros.length && libros[j]!=null; j++) {
			Leer.mostrarEnPantalla(j+".- "+libros[j].getTitulo());
		}
	}
	private static void mostrarListaAutores(Autor[] autores) {
		for (int i = 0; i < Autor.getSiguiente(); i++) {
			System.out.print(i+".-"+autores[i].getNombre()+"\n");
	}
	}

	public static Libro[] introducirLibros(Autor autores [],Libro libros[]) {
		String titulo;
		int numeroAutores;
		Autor autor[];
		titulo = Leer.pedirCadena("introduce el titulo");
		numeroAutores = Leer.pedirEntero("cuantos autores tiene el libro");
		autor = new Autor[numeroAutores];
		autor = seleccionarAutor(autores,numeroAutores,libros);
		libros[Libro.getContador()]=new Libro(titulo,autor, numeroAutores);
			return libros;
	}
	public static Autor [] seleccionarAutor(Autor autores [],int numeroAutores,Libro libros []) {
		Autor autor[] = new Autor[numeroAutores];
			mostrarListaAutores(autores);
			for (int i = 0; i < numeroAutores; i++) {
				int idlibro=Leer.pedirEntero("introduce el Id del autor");
				autor[i] = autores[idlibro];
		}
		return autor;
	}

	public static Autor[] introducirAutor (Autor autores[]){
		String nombre;
		String email;
		char sexo;
		Fecha fechaNacimiento;
		boolean resultado = false;
		for (int i = 0; (resultado==false && i < autores.length ); i++) {
			if (autores[i]==null) {
				nombre = Leer.pedirCadena("Introduce el nombre del autor");
				email = Leer.pedirCadena("email");
				sexo = Leer.pedirCadena("introduce F o M","[F,M]").charAt(0);
				fechaNacimiento = IntroducirFecha();
				autores[i]= new Autor(nombre, email, sexo, fechaNacimiento);
				resultado = true;
			}
		}
		return autores;
	}
	/**
	 * @param autor
	 * @param numeroAutores
	 */
	/**public static Autor[] IntroducirAutores() {
		String nombre;
		String email;
		char sexo;
		Fecha fechaNacimiento;
		Autor autor[] = new Autor[5];
		int numeroAutores = Leer.pedirEntero("introduce numero de autores");
		for (int j = 0; j < numeroAutores; j++) {
			nombre = Leer.pedirCadena("Introduce el nombre del autor");
			email = Leer.pedirCadena("email");
			sexo = Leer.pedirCadena("introduce F o M").charAt(0);
			fechaNacimiento = IntroducirFecha();
			autor[j] = new Autor(nombre, email, sexo, fechaNacimiento);
		}
		return autor;
	}*/

	/**
	 * @return
	 */
	public static Fecha IntroducirFecha() {
		Fecha fechaNacimiento;
		int dia = Leer.pedirEntero("dia");
		int mes = Leer.pedirEntero("mes");
		int ano = Leer.pedirEntero("año");
		fechaNacimiento = new Fecha(dia, mes, ano);
		return fechaNacimiento;
	}

	public static Autor[] variosAutores(Autor autores[]) {	
		
		for (int i = 0; i < autores.length; i++) {
			if (i>autores.length/2 && autores[i]!=null) {
				autores = Arrays.copyOf(autores,autores.length+10);
			}
		}
		
		autores[Autor.getSiguiente()] = new Autor("Millan kundera", "milan@fontecabras.es", 'M', new Fecha(24,7,1977));
		autores[Autor.getSiguiente()] = new Autor("J.R.R Tolkien", "JRR@fontecabras.es", 'F', new Fecha(23,8,1973) );
		autores[Autor.getSiguiente()] = new Autor("Patrick Süskind", "patrick@fontecabras.es", 'M', new Fecha(24,1,1987));
		autores[Autor.getSiguiente()] = new Autor("Ken Follett", "patrick@fontecabras.es", 'M', new Fecha(01,3,1957));
		autores[Autor.getSiguiente()] = new Autor("Irvine Welsh", "patrick@fontecabras.es", 'M', new Fecha(28,2,1965));


		return autores;
	}

	public static Libro[] variosLibros(Autor autores [], Libro libros[]) {
		for (int i = 0; i < libros.length; i++) {
			if (i>libros.length/2 && libros[i]!=null) {
				libros = Arrays.copyOf(libros,libros.length+10);
			}
		}
		
		libros[Libro.getContador()] = new Libro("La insoportable levedad del ser", autores [0]);
		libros[Libro.getContador()] = new Libro("El señor de los anillos", autores[1]);
		libros[Libro.getContador()] = new Libro("El perfume", autores[2]);
		libros[Libro.getContador()] = new Libro("Trainspotting", autores[4]);
		libros[Libro.getContador()] = new Libro("El tercer gemelo", autores[3]);
		libros[Libro.getContador()] = new Libro("Los Pilares de la tierra",autores[3]);
		libros[Libro.getContador()] = new Libro("En la boca del dragón", autores[3]);
		

		return libros;
	}
}