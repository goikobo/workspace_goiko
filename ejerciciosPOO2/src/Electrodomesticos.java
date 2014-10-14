
public class Electrodomesticos {
	/*
	 * Crearemos una superclase llamada Electrodomestico con las siguientes características:
	 *Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
	 *Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
	 *
	 *Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
	 *
	 *Los constructores que se implementaran serán
	 *Un constructor por defecto.
	 *Un constructor con el precio y peso. El resto por defecto.
	 *Un constructor con todos los atributos.
	 */
	private int precioBase;
	private String color; //Los colores disponibles son blanco, negro, rojo, azul y gris.
	private char consumo;
	private int peso;
	protected final static char CONSUMO_ENERG_DEF='F'; // defino la constante (se declaran en may) 
	protected final String COLOR_DEF="blanco";
	
	public Electrodomesticos() {
		// TODO Auto-generated constructor stub
		
		this.color  = COLOR_DEF;
		this.consumo = 'F';
		this.precioBase = 100;
		this.peso = 5;
		comprobarConsumoEnergetico(this.consumo);
		comprobarcolor(this.color);
}
	public Electrodomesticos(int precioBase, int peso){
		this.color  = COLOR_DEF;
		this.consumo = CONSUMO_ENERG_DEF;
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(this.consumo);
		comprobarcolor(this.color);
	}

	public Electrodomesticos (int precioBase, String color, char consumo, int peso){
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		comprobarConsumoEnergetico(this.consumo);
		comprobarcolor(this.color);
	}
	/**
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	
	/*
	 * Los métodos que implementara serán:
	 * Métodos get de todos los atributos.
	 * comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
	 *  Se invocara al crear el objeto y no será visible.
	 *  
	 *  comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. 
	 *  Se invocara al crear el objeto y no será visible.
	 *  
	 *  precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
	 */
	
/*	public boolean comprobarConsumoEnergetico(){
		String tconsumos = "ABCDEF";
		if(tconsumos.indexOf(this.consumo)>=0){
			return true;
		}else{
			this.consumo='F';
			return false;
		}*/
	
	protected void comprobarConsumoEnergetico(char letra){
	
		if (letra>='A'&& letra <='F'){
			this.consumo = letra;			
		}else {
			this.consumo = CONSUMO_ENERG_DEF;
		}
	}	
	
	protected void comprobarcolor(String color){
		String colores[]={"blanco","negro","rojo","azul","gris"};
		
		boolean encontrado = false;
		for (int i = 0; i>colores.length;i++){
			if (colores[i].equals(color.toLowerCase())){
				encontrado = true;
		}
			}
		if (encontrado){
			this.color = color.toLowerCase();
		}else{
			this.color = this.COLOR_DEF;
		}
		}
	
	public int precioFinal(){
		int sumar = 0;
		switch (this.consumo){
		case 'A':
			sumar += 100;
			break;
		case 'B':
			sumar += 80;
			break;
		case 'C':
			sumar += 60;
			break;
		case 'D':
			sumar += 50;
			break;
		case 'E':
			sumar += 30;
			break;
		case 'F':
			sumar += 10;
			break;
		}
		if (this.peso < 20){
			sumar += 10;
			
		}else if (this.peso<50){
			sumar += 50;
		}else if (this.peso<80){
			sumar += 80;
		}else if (this.peso >=80){
			sumar += 100;
		}
		return this.precioBase + sumar;
	}
	
}

