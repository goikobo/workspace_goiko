

public class rellenarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// crear una matriz 10x10 y rellenarlo con n�meros aleatorios
		int[][] matriz = new int [10][10];
		int numero;
		// recorremos las filas y vamos incrementando
		for (int x=0; x < matriz.length; x++) {
			
			// recorremos las columnas
			  for (int y=0; y < matriz[x].length; y++) {
				  
				  matriz[x][y] = (int)(Math.random()*101);
			    System.out.print (matriz[x][y]+ " ");
			    
			  }
			  // cada vez que recorremos una fila, lanzamos un salto de línea
			  System.out.println();
			  
			}
	}

}
