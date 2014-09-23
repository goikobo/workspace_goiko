import java.util.Scanner;


public class RecorrerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNums = new int[10];
		Scanner entrada = new Scanner(System.in);		
		for (int i=0; i<arrayNums.length; i++){
			System.out.println("Introduce un número");
			arrayNums[i] = entrada.nextInt();
		}
entrada.close();
	}

}
