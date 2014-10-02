
public class funcMatrizMaxMinMed {
	
	public static int maximo(int[]vector){
		//funcion que busca el valor máximo en un array unidimensional
		int result = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>result){
				result = vector[i];
			}
		}
		return result;
	}
	
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
	public static int media(int[]vector){
		//funcion que saca el valor medio del array
		int medMed = 0;
		for (int i= 0;i>vector.length;i++){
			medMed = medMed + vector[i];
		}
		//return (medMed/vector.length);
		return medMed;
	}

	public static void main(String[] args) {

		// declaramos la matriz 10x10
		int[][] matriz = new int[10][10];
		// llenamos la matriz con datos aleatorios.
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				matriz[i][j] = (int)(Math.random()*31);
			}
		}

		/*
		 * Devolver para cada fila:
		 * 		- el máximo
		 * 		- el mínimo
		 * 		- la media
		 * La máxima de todas las medias
		 * El máximo y el mínimo de la matriz
		 * La media de toda la matriz
		 * 
		 * */

		//recorremos la matriz y la vamos "pintando"
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
			int vmaximo = maximo(matriz[i]);
			int vminimo = minimo(matriz[i]);
			int vmedia = media(matriz[i]);
			double mediavector = vmedia/10;
			System.out.println("máximo: " + vmaximo+" mínimo: "+ vminimo+" media: "+ mediavector);
			System.out.println();
		}
	}

}