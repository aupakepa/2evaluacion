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
+toString(): String
Supondremos que un libro sólo tiene un autor y que el método toString devolverá una cadena de caracteres como la siguiente (por ejemplo):
“Libro [titulo = El asedio,
Autor [nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954]  
precio = 18,90 
cantidad = 3]”
*/
public class Libro {
private String titulo;
private Autor autor;
private double precio;
private Integer cantidad = 0;
/**
 * @param titulo
 * @param autor
 * @param precio
 * @param cantidad
 */
public Libro(String titulo, Autor autor, double precio, Integer cantidad) {
	this.titulo = titulo;
	this.autor = autor;
	this.precio = precio;
	this.cantidad = cantidad;
}
/**
 * @param titulo
 * @param autor
 * @param precio
 */
public Libro(String titulo, Autor autor, double precio) {
	this.titulo = titulo;
	this.autor = autor;
	this.precio = precio;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public Autor getAutor() {
	return autor;
}
public void setAutor(Autor autor) {
	this.autor = autor;
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
@Override
public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad + "]"+"\n";
}

}
