
public class generar100 {

	public static void main(String[] args) {
		// ESTE LO HICE YO!!!
//generar 10 n�meros aleatorios entre 0 y 100, pero que no se repitan.
		
		// numero = (int)Math.random()*101; <- *100 llegar� como m�ximo a 99; *101 llegar� a 100
		int[] numeros = new int [10];
		for (int i= 0; i<10;i++){
			double resultado = Math.random()*101;
			int convertido = (int)resultado;
			// comparar resultado con array 
				for (int x=0; x<10;x++){
					if (numeros[x]!=convertido){
						numeros[i] = convertido;
						break;
					}else {
						System.out.println("ERROR!");
					}
				}			
			System.out.println(i+" numero "+numeros[i]);
		}
		
	}

}
