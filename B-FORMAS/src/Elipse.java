/*2. Defina una clase Elipse derivada de forma. Recordatorio: una elipse queda definida por
* su radio mayor (R) y su radio menor (r), tal que el área de una elipse es
* igual a π*(R*r).*/
public class Elipse extends Forma {
	private double rmayor;
	private double rmenor;

	public Elipse(double[] centro, char nombre, String color, double rmayor, double rmenor) {
		super(centro, nombre, color);
		this.rmayor = rmayor;
		this.rmenor = rmenor;
	}

	@Override
	public String toString() {
		return "Elipse [rmayor=" + rmayor + ", rmenor=" + rmenor + "]";
	}

	public double getRmayor() {
		return rmayor;
	}

	public void setRmayor(double rmayor) {
		this.rmayor = rmayor;
	}

	public double getRmenor() {
		return rmenor;
	}

	public void setRmenor(double rmenor) {
		this.rmenor = rmenor;
	}

	public double calculaArea() {
		double area = rmayor * rmenor * Math.PI;
		return area;
	}
}
