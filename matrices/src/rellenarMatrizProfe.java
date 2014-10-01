
public class rellenarMatrizProfe {

	public static void main(String[] args) {
		// declaramos una matriz de 10x10
		int[][] matriz = new int[10][10];
		// rellenamos la matriz con los datos
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				matriz[i][j] = (int)(Math.random()*31);
			}
		}
		// recorremos la matriz, rescatamos los datos y los pasamos por pantalla.
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
