import java.util.Random;


public class Persona {
	// si las declaramos public, serán accesibles sin problemas. Si las ponemos en private, tendremos que usar "getters" y "setters"
	private String nombre;
	private int edad;
	private String dNI;
	private char sexo;
	private double peso; // en kg
	private double altura; // en metros con decimales
	private short resultadoIMC = 0; 
	
	/* podemos inicializar los aspectos del objeto. De esta forma, al crear un nuevo objeto 
	 * sus valores no serán null, sino los que le digamos
	 */
	public Persona(){
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
		 generaDNI();
	}
	/*
	 * gracias a esto, podemos crear el objeto directamente en plan: 
	 * Persona persona1 = new Persona ("javi", "heras", 35);  
	 */

	public Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0; 
		generaDNI();	
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generaDNI();
	}
	
	public boolean esMayorDeEdad(){
		
		return(this.edad >=18);

	}
	
	public int calcularIMC(){
		// float imc = (float)(this.peso /(Math.pow(this.altura, 2)));
		double imc = (peso/(altura*altura));
		if (imc >= 25){
			this.resultadoIMC = 1;
		}
		if (imc == 0){
			this.resultadoIMC = 0;
		}
		if (imc <= 18.5){
			this.resultadoIMC = -1;
		}
		return this.resultadoIMC;
	}
//
//	public String generaDNI(){
//		
//		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
//		int numero = (int)(Math.random() * 100000000);
//		char letra  = letras.charAt(numero % 23);
//		this.dNI = numero + "-"+letra;
//		return this.dNI;
//	}
	
	
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
	
	private char comprobarSexo(char sexo){
		/*
		 * private boolean comprobarSexo(cahr sexo){
		 * 		return this.sexo==sexo;
		 * }
		 */
		if (this.sexo != 'H' || this.sexo != 'M'){
			this.sexo = 'H';
		}
		return this.sexo;
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

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return dNI;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		this.dNI = dNI;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
