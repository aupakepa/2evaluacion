import utilidades.Leer;

/**
 * B.- Ejercicio de Herencia y Polimorfismo: FORMAS
 * 
 * 1. Defina una clase Forma que tenga los siguientes miembros de datos: - Color
 * - Coordenada del centro de la forma (objeto Punto) - Nombre de la forma (char
 * *) Y, al menos, las siguientes funciones miembro: - Imprimir - Obtener y
 * cambiar el color - Mover la forma (o sea, su centro) Defina una clase
 * derivada Rectangulo que tenga los siguientes miembros como datos: - Lado
 * menor. - Lado mayor. Y, al menos, las siguientes funciones miembro: -
 * Imprimir. Debe imprimir quÃ© se trata de un rectÃ¡ngulo mostrando su nombre,
 * color, centro y lado. DeberÃ­a usarse la funciÃ³n Imprimir de la clase base
 * para realizar parte de este trabajo. - Calcular el Ã¡rea (lado menor * lado
 * mayor). - Calcular el perÃ­metro. (2 * lado menor + 2 * lado mayor). -
 * Cambiar el tamaÃ±o del rectÃ¡ngulo. Recibe como parÃ¡metro un factor de
 * escala. AsÃ­, por ejemplo, si el factor vale 2, el rectÃ¡ngulo duplicarÃ¡ su
 * tamaÃ±o y si es 0,5 se reducirÃ¡ a la mitad. Realice un programa que pruebe
 * el funcionamiento de estas clases. Debe crear objetos y comprobar el correcto
 * funcionamiento de las funciones miembro.
 * 
 * 2. Defina una clase Elipse derivada de forma. Recordatorio: una elipse queda
 * definida por su radio mayor (R) y su radio menor (r), tal que el Ã¡rea de una
 * elipse es igual a Ï€*(R*r).
 * 
 * 3. Defina una clase Cuadrado derivada de la clase Rectangulo.
 * 
 * 4. Defina una clase Circulo derivada de la clase Elipse.
 * 
 * 5. Realice un programa que defina varias formas diferentes, cree un vector de
 * punteros de la clase Forma que apunten a los objetos creados. El programa
 * debe realizar un bucle que recorra todas las formas, las ponga todas del
 * mismo color y las mueva a una determinada posiciÃ³n.
 * 
 * 6. Analice quÃ© ocurre en el ejercicio anterior si se intenta imprimir la
 * informaciÃ³n de cada forma y quÃ© sucede si se intenta obtener en ese bucle
 * el Ã¡rea de todas las formas del vector.
 * 
 * 7. Utilice la tÃ©cnica de las funciones virtuales para arreglar los
 * comportamientos anÃ³malos detectados en el ejercicio anterior.
 * 
 * 8. Desarrolle un programa que, dado un conjunto de formas, calcule cuÃ¡l
 * tiene el Ã¡rea mÃ¡xima e imprima la informaciÃ³n de dicha forma. 9. Â¿CÃ³mo
 * harÃ­a para obligar que todas las clases futuras derivadas tengan al menos
 * los mÃ©todos â€œÃ¡reaâ€� y â€œperÃ­metroâ€�. Â¿Tiene sentido incluir definir
 * dichos mÃ©todos en la clase â€œformaâ€�? 10. Haga un diagrama de clases que
 * refleja la estructura definida hasta el momento. AÃ±Ã¡dale las clases: Punto,
 * LÃ­nea, TriÃ¡ngulo, TriÃ¡ngulo RectÃ¡ngulo y PolÃ­gono. Â¿DÃ³nde irÃ­an?
 * Â¿CuÃ¡les serÃ­an sus atributos y propiedades? (No los implemente)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Forma vector[] = new Forma[10];
		double coordenada[] = { 0, 0 };
		int menu = -1;
		vector[0] = new Rectangulo(coordenada, 'R', "verde", 10, 20);
		do {
			Leer.mostrarEnPantalla("1.Crear una Elipse");
			Leer.mostrarEnPantalla("2.Crear un Rectangulo");
			Leer.mostrarEnPantalla("3.Crear un Cuadrado");
			Leer.mostrarEnPantalla("4.Crear un circulo");
			Leer.mostrarEnPantalla("5.visualizar Vector");
			Leer.mostrarEnPantalla("6.Cambiar color de todos las formas");
			Leer.mostrarEnPantalla("7.Cambiar Centro de todas las formas");
			Leer.mostrarEnPantalla("8.Introducir una forma");
			menu = Leer.pedirEntero("introduczca una opcion de menu");
		} while (menu != 0);
	}

}
