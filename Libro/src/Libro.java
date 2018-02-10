import java.util.Arrays;

/**Libro
-titulo: String (no tiene valor por defecto)
-autor:  Autor
-precio: Double
-cantidad: Integer = 0
+Libro(String titulo, Autor autor, Double precio)
+Libro(String titulo, Autor autor, Double precio,
             Integer cantidad)
+getTitulo(): String
+getAutor: Autor
+getPrecio(): Double
+setPrecio (precio: double): void
+getCantidad(): Integer
+setCantidad(cantidad: int): void
+toString(): String*/
public class Libro {
private String titulo;
private double precio;
private Integer cantidad;
private Autor autor [];
static Integer contador = 0;
@Override
public String toString() {
	return "Libro  "+" titulo=" + titulo +" "  + precio +" € \n"+ "(autor=" + Arrays.toString(autor) + ")\n";
}
public String toString2() {
	return "Libro [titulo=" + titulo + ", precio=" + precio + ", cantidad=" + cantidad + ", autor="
			+ Arrays.toString(autor) + "]";
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public Autor [] getAutor() {
	return autor;
}
public void setAutor(Autor autor[]) {
		this.autor = autor;
	
}
public Libro(String titulo, Autor autor[], Integer numero) {
	autor = new Autor[numero];
	this.titulo = titulo;
	this.precio = 0;
	this.cantidad = 1;
	this.autor = autor;
	contador++;
}
public Libro(String titulo, Autor autor) {
	Autor autor1[] = new Autor[1];
	autor1[0]= autor;
	this.titulo = titulo;
	this.precio = 0;
	this.cantidad = 1;
	this.autor = autor1;
	contador++;
}
public static Integer getContador() {
	return contador;
}
public static void setContador(Integer contador) {
	Libro.contador = contador;
}

}