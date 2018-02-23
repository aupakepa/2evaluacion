
public class Circulo extends Elipse {

	public Circulo(double[] centro, char nombre, String color, double radio) {
		super(centro, nombre, color, radio, radio);
		// TODO Auto-generated constructor stub
	}

	public double calculaArea() {
		double area = this.getRmayor() * super.getRmenor() * Math.PI;
		return area;
	}
}
