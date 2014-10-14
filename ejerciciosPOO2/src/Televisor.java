/*
 * Crearemos una subclase llamada�Television�con las siguientes caracter�sticas:
 * Sus atributos son�resoluci�n�(en pulgadas) y�sintonizador TDT�(booleano), adem�s de los atributos heredados.
 * 
 * Por defecto, la resoluci�n ser� de 20 pulgadas y el sintonizador ser� false.
 * 
 * Los constructores que se implementaran ser�n:
 * Un constructor por defecto.
 * Un constructor con el precio y peso. El resto por defecto.
 * Un constructor con la resoluci�n, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al 
 * constructor de la clase padre.
 * 
 * Los m�todos que se implementara ser�n:
 * M�todo get de resoluci�n y sintonizador TDT.
 * precioFinal(): si tiene una resoluci�n mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador 
 * TDT incorporado, aumentara 50 �.�Recuerda que las condiciones que hemos visto en la clase Electrodomestico tambi�n deben 
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
