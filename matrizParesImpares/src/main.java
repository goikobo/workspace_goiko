/*
 * 2.- DUF a la que se le pasa como parámetro una tabla que debe rellenar. Se leerá por teclado una
 * serie de números: guardaremos solo los pares e ignoraremos los impares. También hay que devolver la
 * cantidad de impares ignorados.
 */


public class main {
	
	public static int matrizPares(int[][] matriz){
		int veces=0;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[0].length;j++){
				int num;
				do{
					num = (int)(Math.random()*101);
					veces++;
				}while (num%2!=0);
				veces--;
				matriz[i][j]= num;
			}
		}
		return veces;
	}

	public static void main(String[] args) {
		int[][] matriz =new int[4][3];
		matrizPares(matriz);
		System.out.println("adios");
	}

}