public class Monstruo {
	
	private String color;
	private int maxbolas;
	private int bolascomidas;
	
	public void crear(int maxbolas,String color){
		if (maxbolas > 0){
			this.maxbolas = maxbolas;
		}
		else{ 
			this.maxbolas = 10;
		}
		if ( color.equals("azul") || color.equals("rojo") || color.equals("verde") || color.equals("amarillo") ){
			this.color = color;
		}
		else{
			this.color = "";
		}
	}
}