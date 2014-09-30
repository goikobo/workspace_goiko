import java.util.Scanner;


public class figura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// igual que figura1, pero con un solo for 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un numero");
		int n = entrada.nextInt();
		String linea = "";
		for (int i=1; i<=n;i++){
			linea = linea +i;
			System.out.println(linea);
		}
	}

}
