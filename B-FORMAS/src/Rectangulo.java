/*	- Lado menor.
	- Lado mayor.
Y, al menos, las siguientes funciones miembro:
	- Imprimir. Debe imprimir qué se trata de un rectángulo mostrando su
nombre, color, centro y lado. Debería usarse la función Imprimir de la
clase base para realizar parte de este trabajo.
	- Calcular el área (lado menor * lado mayor).
	- Calcular el perímetro. (2 * lado menor + 2 * lado mayor).
	- Cambiar el tamaño del rectángulo. Recibe como parámetro un factor de
escala. Así, por ejemplo, si el factor vale 2, el rectángulo duplicará su
tamaño y si es 0,5 se reducirá a la mitad.*/
public class Rectangulo extends Forma {
	private double mayor;
	private double menor;

	public Rectangulo(double[] centro, char nombre, String color, double mayor, double menor) {
		super(centro, nombre, color);
		this.mayor = mayor;
		this.menor = menor;
	}

	@Override
	public String toString() {
		return "Rectangulo [mayor=" + mayor + ", menor=" + menor + "]";
	}

	public double getMayor() {
		return mayor;
	}

	public void setMayor(double mayor) {
		this.mayor = mayor;
	}

	public double getMenor() {
		return menor;
	}

	public void setMenor(double menor) {
		this.menor = menor;
	}

	public double calculaArea() {
		double area = mayor * menor;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 2 * mayor + 2 * menor;
		return perimetro;
	}

	public void redimensionar(double factor) {
		this.setMayor(factor * this.getMayor());
		this.setMenor(this.getMenor() * factor);
	}
}
