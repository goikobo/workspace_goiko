/*
 * Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en com�n, por eso vamos 
 * a hacer una interfaz llamada�Entregable�con los siguientes m�todos:
 * entregar(): cambia el atributo prestado a true.
 * 
 * devolver(): cambia el atributo prestado a false.
 * isEntregado(): devuelve el estado del atributo prestado.
 * M�todo�compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
 * �Como par�metro que tenga un objeto, no es necesario que implementes la interfaz Comparable. 
 * Recuerda el uso de los casting de objetos.
 */

public interface Entregable {
	void entregar();
	void devolver();
	boolean isEntregado();
	int compareTo(Object a);
	String getTitulo();
	String setTitulo();
	

}
