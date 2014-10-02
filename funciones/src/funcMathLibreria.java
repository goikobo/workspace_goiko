import java.util.Scanner;

import funciones.Funciones;
// importo las funciones definidas en otra clase que est� en el paquete funciones.


public class funcMathLibreria {

	public static void main(String[] args) {

		int[] vmaximo = new int[10];
		int[] vminimo = new int[10];
		int[] vmedia = new int[10];
		// declaramos la matriz 10x10
		int[][] matriz = new int[10][10];
		// llenamos la matriz con datos aleatorios.
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				matriz[i][j] = (int)(Math.random()*101);
			}
		}

		/*
		 * Devolver para cada fila:
		 * 		- el m�ximo
		 * 		- el m�nimo
		 * 		- la media
		 * La m�xima de todas las medias
		 * El m�ximo y el m�nimo de la matriz
		 * La media de toda la matriz
		 * 
		 * */

		//recorremos la matriz y la vamos "pintando"
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}

			System.out.println();
// invocamos las funciones indic�ndoles de d�nde la cojemos (clase Funciones en package funciones) 
			vmaximo[i] = Funciones.maximo(matriz[i]);
			vminimo[i] = Funciones.minimo(matriz[i]);
			vmedia[i] = Funciones.media(matriz[i]);
			System.out.println("m�ximo: " + vmaximo[i]+" m�nimo: "+ vminimo[i]+" media: "+ vmedia[i]);
			System.out.println();
		}
			int tmaximo = Funciones.maximo(vmaximo);
			int	tminimo= Funciones.minimo(vminimo);
			int tmedia = Funciones.media(vmedia);
			System.out.println("maximo total: "+tmaximo+" minimo total: "+tminimo+" media total: "+ tmedia);


			;
			System.out.println(Funciones.factorial(5));
			System.out.println("el area de un rectangulo 5x4 es " +Funciones.calcularArea(5, 4));
			System.out.println("el area de un c�rculo de radio 5 es "+ Funciones.calcularArea(5));
			System.out.println("dame los numeros");
			String num1, num2;
			Scanner entrada = new Scanner(System.in);
			num1 = entrada.nextLine();
			num2 = entrada.nextLine();
			if (num2.equals("0")){
				System.out.println(Funciones.calcularArea(Double.parseDouble(num1)));
			}else {
				System.out.println(Funciones.calcularArea(Integer.parseInt(num1), Integer.parseInt(num2)));
			}
			Funciones.calcularArea(num1, num2);
}	
	}
