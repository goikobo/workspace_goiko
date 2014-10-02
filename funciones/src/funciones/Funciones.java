package funciones;

import java.util.Scanner;
/*
 *comentar para javadocs: seleccionamos el nombre de la función > boton dcho> source > generate element commen
 */

public class Funciones {
	
	/** Dado un array, calcula el valor máximo de un array
	 * @param vector : se le pasa como parámetro un array
	 * @return : devuelve el valor máximo de los valores del array
	 */	
	public static int maximo(int[] vector){
		//funcion que busca el valor máximo en un array unidimensional
		int result = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>result){
				result = vector[i];
			}
		}
		return result;
	}

	/** Dado un array, calcula el valor mínimo de un array
	 * @param vector : se le pasa como parámetro un array
	 * @return : devuelve el valor mínimo de los valores del array
	 */	
	public static int minimo(int[]vector){
		//funcion que busca el valor mínimo en un array unidimensional
		int result = Integer.MAX_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]<result){
				result = vector[i];
			}
		}
		return result;
	}

	/** Dado un array, calcula la media de sus valores
	 * @param vector : se le pasa como parámetro un array
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

	/** Dada una Matriz, calcula el valor máximo existente en sus valores
	 * @param matriz : se le indica la matriz de la que va a calcular los valores
	 * @return : devuelve el valor máximo como un entero.
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
	 * función que suma dos números
	 * @param num1: primero número a sumar
	 * @param num2: segundo número a sumar
	 * @return resultado de sumar num1+num2
	 */
	public static int suma(int num1, int num2){
		int resultado=0;
		resultado = num1+num2;
		return resultado;
	}
	
	/** Calcula el factorial de un número
	 * @param numero Introducimos como Int el valor del que se realizará el factorial
	 * @return devuelve el factorial del número indicado. 
	 */
	public static int factorial ( int numero){

		for (int i= numero -1; i>1;i--){
			numero = numero * i; 
		}
		return numero;
	}
	
	/*
	 * Se denomina sobrecarga de funciones cuando hay dos ó más funciones que se llaman igual pero devuelven
	 * distintos valores en función de los argumentos que se le indiquen. 
	 */
	
	/** Esta función calcula el área de un rectángulo
	 * @param x : variable que contiene el ancho/alto
	 * @param y : variable que contiene el ancho/alto
	 * @return : devuelve el resultado en una variable int llamada resultado
	 */
	public static int calcularArea (int x, int y){
		int resultado = x * y;
		return resultado; 
		
	}
	
	/** Calcula el área de un círculo
	 * @param x Introducimos como double el valor del radio.
	 * @return  Devuelve el área de un círculo
	 */
	public static double calcularArea (double radio){
		double resultado = Math.PI * Math.pow(radio,  2); 
		return resultado;
		
	}
	
	
	
}
