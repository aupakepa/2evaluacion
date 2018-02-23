import java.util.Arrays;

/*- Color
- Coordenada del centro de la forma (objeto Punto)
- Nombre de la forma (char *)
Y, al menos, las siguientes funciones miembro:
- Imprimir
- Obtener y cambiar el color
- Mover la forma (o sea, su centro)*/
public class Forma {
	private double centro[] = new double[2];
	private char nombre;
	private String color;
	static Integer siguiente = 1;

	public Forma(double[] centro, char nombre, String color) {
		super();
		this.centro = centro;
		this.nombre = nombre;
		this.color = color;
		siguiente++;
	}

	@Override
	public String toString() {
		return "Forma [coordenada=" + Arrays.toString(centro) + ", nombre=" + nombre + ", color=" + color + "]";
	}

	public double[] getCoordenada() {
		return centro;
	}

	public void setCoordenada(double[] coordenada) {
		this.centro = coordenada;
	}

	public char getNombre() {
		return nombre;
	}

	public void setNombre(char nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calculaArea() {
		double area = 0;
		return area;
	}
}
