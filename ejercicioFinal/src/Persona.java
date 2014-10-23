import java.util.Random;



public class Persona {
	private String nombre;
	private String apellidos;
	private String dNI;
	
	public Persona () {
		this.nombre = "";
		this.apellidos = ""; 
		generaDNI();
		
	}

	public Persona (String nombre, String apellidos) {
		this.nombre = "";
		this.apellidos = ""; 
		generaDNI();
		
	}

private void generaDNI(){
	Random rand = new Random();	
	//rand.nextInt ((max - min) +1) + min
	int num = rand.nextInt((99999999-1000000)+1)+10000000;
	char letra = this.generaLetra(num);
	this.dNI = num+"-"+letra;
}

private char generaLetra(int dni){
	String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	char letraBuena = letras.charAt(dni % 23);
	return letraBuena;
}

/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * @return the apellidos
 */
public String getApellidos() {
	return apellidos;
}

/**
 * @param apellidos the apellidos to set
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

/**
 * @return the dNI
 */
public String getdNI() {
	return dNI;
}

/**
 * @param dNI the dNI to set
 */
public void setdNI(String dNI) {
	this.dNI = dNI;
}


}
