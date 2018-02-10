package expresion_regular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utilidades.Leer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader teclado;
			teclado = new BufferedReader(new InputStreamReader(System.in));
			String texto = "Cuando utilice cart@uchos.es de impresión que no de email@mail.tk, "
					+ "es que algunas características impresión de los datos del ej.http://blogspot.com "
					+ "volumen restante, estén disponibles por 192.168.1.1 usar suministro que no sea de api.";
			System.out.println("Inserta expresion regular: ");
			String ex_regular = teclado.readLine();
			Pattern pat = Pattern.compile(ex_regular);
			do {
				texto = Leer.pedirCadena("introduce una cadena");
				Matcher mat = pat.matcher(texto);
				while (mat.find()) {
					String aux = mat.group();
					System.out.println("Encontrado: " + aux);
				}
			} while (Leer.pedirEntero("Pulsa 0 para salir o otra cosa para repetir") != 0);

		} catch (IOException ex) {
		}

	}
}