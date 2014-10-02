package funciones;

import java.util.Scanner;
/*
 *comentar para javadocs: seleccionamos el nombre de la funci�n > boton dcho> source > generate element commen
 */

public class Funciones {
	
	/** Dado un array, calcula el valor m�ximo de un array
	 * @param vector : se le pasa como par�metro un array
	 * @return : devuelve el valor m�ximo de los valores del array
	 */	
	public static int maximo(int[] vector){
		//funcion que busca el valor m�ximo en un array unidimensional
		int result = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>result){
				result = vector[i];
			}
		}
		return result;
	}

	/** Dado un array, calcula el valor m�nimo de un array
	 * @param vector : se le pasa como par�metro un array
	 * @return : devuelve el valor m�nimo de los valores del array
	 */	
	public static int minimo(int[]vector){
		//funcion que busca el valor m�nimo en un array unidimensional
		int result = Integer.MAX_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]<result){
				result = vector[i];
			}
		}
		return result;
	}

	/** Dado un array, calcula la media de sus valores
	 * @param vector : se le pasa como par�metro un array
	 * @return : devuelve la media de los valores del array
	 */
	public static int media(int[]vector){
		//funcion que saca el valor medio del array
		int medMed = 0;
		for (int i= 0;i<vector.length;i++){
			medMed = medMed + vector[i];
		}
		return (medMed/vector.length);
		//return medMed;
	}

	/** Dada una Matriz, calcula el valor m�ximo existente en sus valores
	 * @param matriz : se le indica la matriz de la que va a calcular los valores
	 * @return : devuelve el valor m�ximo como un entero.
	 */
	public static int maximo(int[][] matriz){
		int max = Integer.MIN_VALUE;
		int cols = matriz[0].length;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<cols;j++){
				if (matriz[i][j]<max){
					max = matriz[i][j];
				}
			}
			
		}
		return max;
	}	
	
	/**
	 * funci�n que suma dos n�meros
	 * @param num1: primero n�mero a sumar
	 * @param num2: segundo n�mero a sumar
	 * @return resultado de sumar num1+num2
	 */
	public static int suma(int num1, int num2){
		int resultado=0;
		resultado = num1+num2;
		return resultado;
	}
	
	/** Calcula el factorial de un n�mero
	 * @param numero Introducimos como Int el valor del que se realizar� el factorial
	 * @return devuelve el factorial del n�mero indicado. 
	 */
	public static int factorial ( int numero){

		for (int i= numero -1; i>1;i--){
			numero = numero * i; 
		}
		return numero;
	}
	
	/*
	 * Se denomina sobrecarga de funciones cuando hay dos � m�s funciones que se llaman igual pero devuelven
	 * distintos valores en funci�n de los argumentos que se le indiquen. 
	 */
	
	/** Esta funci�n calcula el �rea de un rect�ngulo
	 * @param x : variable que contiene el ancho/alto
	 * @param y : variable que contiene el ancho/alto
	 * @return : devuelve el resultado en una variable int llamada resultado
	 */
	public static int calcularArea (int x, int y){
		int resultado = x * y;
		return resultado; 
		
	}
	
	/** Calcula el �rea de un c�rculo
	 * @param x Introducimos como double el valor del radio.
	 * @return  Devuelve el �rea de un c�rculo
	 */
	public static double calcularArea (double radio){
		double resultado = Math.PI * Math.pow(radio,  2); 
		return resultado;
		
	}
	
	
	
}
