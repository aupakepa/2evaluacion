public class Cuentas {
	private int clientes [] = new int [15];
	
	public void crearVector(){
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = (int) (Math.random()*1000+1);
		}
	}
	
	public void mostrarClientes(){
		int j = 1;
		System.out.println("");
		System.out.println("┌────────────────────┐");
		System.out.println("│      CLIENTES      │");
		System.out.println("├─────────┬──────────┤");
		for (int i = 0; i < clientes.length; i++) {
			System.out.printf("│ Nº  %02d  │  id %04d │\n",j,clientes[i]);
			j++;
		}
		System.out.println("└─────────┴──────────┘");
		System.out.println("");
	}
}
