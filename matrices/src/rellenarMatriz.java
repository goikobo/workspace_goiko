

public class rellenarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// crear una matriz 10x10 y rellenarlo con números aleatorios
		int[][] matriz = new int [10][10];
		int numero;
		boolean encontrado;
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
				  matriz[x][y] = (int)(Math.random()*101);
			    System.out.print (matriz[x][y]+ " ");
			  }
			  System.out.println();
			}
	}

}
