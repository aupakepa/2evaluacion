import utilidades.Leer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena =Leer.pedirCadena("introduce cadena");
		if (cadena.matches("[A,B]")) {
			System.out.println("la cadena esta bien");
		}
		else {
			System.out.println("La cadena esta mal");
		}
	}

}
