import java.util.Scanner;


public class convertirGrados {
// hay que controlar que el numero introducido este entre 0 y 100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n�mero entre 0 y 100");
		float grados = entrada.nextFloat();
		while (grados <0 || grados >100){
			System.out.println("Introduce un n�mero entre 0 y 100");
			grados = entrada.nextFloat();
		}
		float far = 32 + (9* grados / 5);

		float celsius =  ((grados - 32)/36)/2;
		System.out.println("El n�mero dado son "+ far+" grados Farenheit y "+celsius+" grados celsius");
		entrada.close();
	}
	/*
	 * do {
	 * 	System.out.println("Introduce un n�mero entre 0 y 100");
	 * 	grados = entrada.nextFloat();
	 * }
	 * 	while (entrada<0||entrada>100);			
	 * 
	 */

}