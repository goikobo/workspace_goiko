import java.util.Scanner;


public class recorrerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNums = new int[10];
		Scanner entrada = new Scanner(System.in);	
		
		
		for (int i=0; i<arrayNums.length; i++){
			System.out.println("Introduce un Número");
			arrayNums[i] = entrada.nextInt();
		}
		// ahora muestro todas las posiciones por pantalla
		for (int i=0; i<arrayNums.length; i++){
		System.out.println(arrayNums[i]);
		}
		
		
		// un numero aleatorio entre 0 y 10
		double resultado = Math.random()*10;
		System.out.println("resultado de random: "+resultado);
entrada.close();
	}
}
