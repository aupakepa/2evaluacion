import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cuentas cuentas = new Cuentas();

		cuentas.crearVector();

		int opc, salida = 0;
		while (salida == 0) {
			System.out.println("┌──────────────────────┐");
			System.out.println("│         MENU         │");
			System.out.println("├──────────────────────┤");
			System.out.println("│ 1.    CLIENTES       │");
			System.out.println("│ 2.   AÑADIR CASH     │");
			System.out.println("│ 3.   SACAR CASH      │");
			System.out.println("│ 4. Consultar cliente │");
			System.out.println("│ 5.      SALIR        │");
			System.out.println("└──────────────────────┘");
			System.out.print("   Inserte opción » ");
			opc = teclado.nextInt();
			teclado.nextLine();
			switch (opc) {
			case 1:
				cuentas.mostrarClientes();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				System.out.println("Opci�n no encontrada");
				break;
			}
		}
	}

}
