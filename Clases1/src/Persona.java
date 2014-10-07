/*
 * podemos localizar dónde se declara un objeto/aspecto/cosa seleccionando el objeto/aspecto/cosa y pulsar F3 o bien ctrl+click izdo
 */
public class Persona {

	// si las declaramos public, serán accesibles sin problemas. Si las ponemos en private, tendremos que usar "getters" y "setters"
	public String nombre;
	private String apellidos; //necesario getter y setter por estar declarado como private
	private int edad; 
	
	/* podemos inicializar los aspectos del objeto. De esta forma, al crear un nuevo objeto 
	 * sus valores no serán null, sino los que le digamos
	 */
	public Persona(){
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		
	}
	/*
	 * gracias a esto, podemos crear el objeto directamente en plan: 
	 * Persona persona1 = new Persona ("javi", "heras", 35);  
	 */
	public Persona(String nombre, String apellidos, int edad){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	/*
	 * aa partir de aquí, están puestas las funciones de los getters y los setters, necearios cuando los
	 * aspectos de un objeto como private
	 */

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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
