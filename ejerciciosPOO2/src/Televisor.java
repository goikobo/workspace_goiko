/*
 * Crearemos una subclase llamada Television con las siguientes características:
 * Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
 * 
 * Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
 * 
 * Los constructores que se implementaran serán:
 * Un constructor por defecto.
 * Un constructor con el precio y peso. El resto por defecto.
 * Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al 
 * constructor de la clase padre.
 * 
 * Los métodos que se implementara serán:
 * Método get de resolución y sintonizador TDT.
 * precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador 
 * TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben 
 * afectar al precio.
 */
/**
 * @author alumno214
 *
 */

public class Televisor extends Electrodomesticos {
	
	private final int PULGADAS = 20;
	private final boolean TDT = false;
	private int resolucion = PULGADAS;
	private boolean tieneTDT = TDT;

	public Televisor() {
		// TODO Auto-generated constructor stub
		this.resolucion = PULGADAS;
		this.tieneTDT = TDT;
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Televisor(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = PULGADAS;
		this.tieneTDT = TDT;
	}

	public Televisor(int precioBase, String color, char consumo, int peso, int resolucion, boolean tieneTDT) {
		super(precioBase, color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = PULGADAS;
		this.tieneTDT = TDT;
	}
	
	
	public int precioFinal(){
		//primero calculo el incremento por ser un electrodomestico
		int sumar = super.precioFinal();
		//ahora miro si tengo que incrementar por ser lavadora
		if  (this.isTieneTDT()){
			sumar += 50;
		}
		if (this.resolucion>40){
			sumar *= 1.30;
		}		
		return sumar;
	}

	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @return the tieneTDT
	 */
	public boolean isTieneTDT() {
		return tieneTDT;
	}

}
