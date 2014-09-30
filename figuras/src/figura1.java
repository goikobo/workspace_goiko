import java.util.Scanner;


public class figura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un numero");
		
		int n = entrada.nextInt();
for (int i=1; i<=n; i++){
	for (int j=1; j<=i;j++){
		System.out.print(j);
	}
	System.out.println("");
}
	}

}
