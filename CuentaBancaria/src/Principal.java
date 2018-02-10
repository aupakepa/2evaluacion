
/**4)	Vamos a crear la clase CuentaCorriente, con las siguientes propiedades y comportamiento:
CuentaCorriente
- numCuenta: String.Será el número de la cuenta corriente.
- saldo: Double. Saldo actual de la cuenta.
- cliente: String. Nombre de cliente.
+ CuentaCorriente(String cuenta, Double cantidad, String cliente)
+ ingresaEfectivo(Double cantidad) : el parámetro que recibe se lo suma al saldo.
+ retiraEfectivo(Double cantidad): Boolean el parámetro indica la cantidad que queremos retirar. 
 Si hay saldo, restará el importe y devolverá true, en caso contrario devolverá false y no realizará ninguna operación.
+ visualiza() : Mostrará por pantalla la información de la cuenta corriente: Número de cuenta y saldo.
El método main de la clase principal creará dos cuentas corrientes: una con número de cuenta 001 y otra con número de cuenta 002, 
ambas con 0 € de saldo y clientes distintos, posteriormente  mostrará el siguiente menú por pantalla:
1: Ingresar en la cuenta 001
2: Ingresar en la cuenta 002
3: Retirar de la cuenta 001
4: Retirar de la cuenta 002
5: Visualizar ambas cuentas
0: Fin
Dicho menú se ejecutará realizando las operaciones oportunas para cada opción hasta que el usuario elija la opción de fin. El saldo se debe presentar con solo dos decimales.
 
*/
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double saldo;
		double cantidad;
		String nombre;
		int i;
		int menu = -1;
		Banco cuentas[] = new Banco[10];
		inicializar(cuentas);
		do {
			if (Banco.getContador()==1) {
				System.out.println("1: Crear una cuenta");
				System.out.println("0: Salir");
			}
			else {
				System.out.println("1: Crear una cuenta");
				System.out.println("2: Ingresar en una cuenta");
				System.out.println("3: Retirar de una cuenta");
				System.out.println("4: Crear mas cuentas");
				System.out.println("5: consultar saldo");
				System.out.println("0: Salir");
			}
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
				if (Banco.getContador() >= (int) 0.8*cuentas.length) {
					cuentas = Arrays.copyOf(cuentas,(int)(cuentas.length*1.2));
					}
				nombre = Leer.pedirCadena("Introduce un nombre");
				saldo = Leer.pedirDecimal("introduzca saldo");
				cuentas[Banco.getContador()-1] = new Banco(saldo, nombre);	
		break;
		
			/** Si no quieres usar for como sabes donde le toca en el vector 
			 * nombre = Leer.pedirCadena("introduce el nombre de cliente");
			saldo = Leer.pedirDecimal("introduce saldo");
			cuentas[Banco.getContador()-1] = new Banco (saldo,nombre);*/
		
		case 2:
			i = Leer.pedirEntero("introduzca el numero de cuenta en el que desea ingresar");
			cantidad = Leer.pedirDecimal("indique la cantidad a ingresar");
			cuentas[i].ingresaEfectivo(cantidad);
			break;
		case 3:
			i = Leer.pedirEntero("introduzca el numero de cuenta en el que desea retirar");
			cantidad = Leer.pedirDecimal("indique la cantidad a retirar");
			cuentas[i].retiraEfectivo(cantidad);
			break;
		case 4:
			inicializar(cuentas);
			break;
		case 5:
			i = Leer.pedirEntero("introduzca el numero de cuenta a visualizar saldo");
			Leer.mensaje(cuentas[i-1].visualizar());
			break;
		case 0:
			teclado.close();
			break;
			
			default:
				break;
		}
		} while (menu != 0);

			
		}
	private static void inicializar (Banco cuentas []){
		cuentas [Banco.getContador()-1] = new Banco(500, "chabier");
		cuentas [Banco.getContador()-1] = new Banco(400, "juan");
		cuentas [Banco.getContador()-1] = new Banco(300, "sergio");
		cuentas [Banco.getContador()-1] = new Banco(200, "ada");
	}

	}


