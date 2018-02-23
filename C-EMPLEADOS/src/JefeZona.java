/**4. Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de
vendedores a su cargo y tiene coche de la empresa (identificado por la matrícula,
marca y modelo). Incrementa su salario un 20% anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Cambiar de secretario.
• Cambiar de coche.
• Dar de alta y de baja un nuevo vendedor en su zona.
Todos los empleados son vendedores, jefes de zona o secretarios. Hacer un programa
de prueba que muestre como funciona. Probar, especialmente, que el método
incrementar salario se comparta bien, según el empleado que sea así es la subida.*/
public class JefeZona extends Empleado {
private String despacho;
private Secretario secretarioAsignado;
private Coche coche;
private  Vendedor vendedores [];
}
