import utilidades.Leer;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "esto es un ejemplo de como funciona split";
		String var = null;
		String regex;
		int menu = 1;
		do {
			menu = Leer.pedirEntero("0 para salir 1 para probar cadena");
			switch (menu) {
			case 1:
				regex = Leer.pedirCadena("Expresión regular", null);
				do {
					if (regex.equals("")) {
						regex = null;
					}
					var = Leer.pedirCadena("Pedir un cadena", regex);
					Leer.mostrarEnPantalla("El dato " + var);
				} while (menu != 0);

				break;
			case 2:

				break;
			case 0:

				break;

			default:
				break;
			}

		} while (menu != 0);

	}

}
