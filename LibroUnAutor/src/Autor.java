import utilidades.Fecha;

/**Autor
-nombre: String (no tiene valor por defecto)
-email:  String (no tiene valor por defecto)
-sexo: char (los posibles valores son ‘m’ o ‘f’)
-fechaNacimiento: Fecha
+Autor(nombre: String, email: String, genero: String)
+getNombre(): String
+getEmail: String
+setEmail(email: String): void
+getSexo(): char
+toString(): String
El método toString devolverá la siguiente cadena de caracteres (por ejemplo):
 "Autor[nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954]"
*/
public class Autor {
private String nombre;
private String mail;
private char sexo;
private Fecha fechaNacimiento;
/**
 * @param nombre
 * @param mail
 * @param sexo
 * @param fechaNacimiento
 */
public Autor(String nombre, String mail, char sexo, Fecha fechaNacimiento) {
	this.nombre = nombre;
	this.mail = mail;
	this.sexo = sexo;
	this.fechaNacimiento = fechaNacimiento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public Fecha getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Fecha fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
@Override
public String toString() {
	return "Autor [nombre=" + nombre + ", mail=" + mail + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento
			+ "]"+"\n";
}



}
