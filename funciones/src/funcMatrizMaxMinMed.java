
public class funcMatrizMaxMinMed {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				matriz[i][j] = (int)(Math.random()*31);
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

		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}