/*
 * Crearemos una subclase llamada Lavadora con las siguientes características:
Su atributo es carga, además de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
Método get de carga.
precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 */
public class Lavadora extends Electrodomesticos {

	private final int CARGA_DEF =5; // para definir una constante hay que poner el "final" al declararla. Su nombre por
	//convención irá en mayúsculas.
	private int carga = 0;
	
	public Lavadora() {
		super(); // inicializa el constructor con todos los valores definidos en el constructor padre.
		this.carga = CARGA_DEF;
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, String color, char consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	public int precioFinal(){
		//primero calculo el incremento por ser un electrodomestico
		int sumar = super.precioFinal();
		//ahora miro si tengo que incrementar por ser lavadora
		if (this.carga>30){
			sumar += 50;
		}
		
		return sumar;
	}

}
