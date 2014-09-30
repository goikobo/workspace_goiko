import java.util.Scanner;


public class figura3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un numero");
		
		int n = entrada.nextInt();
for (int i=n; i>=1; i--){
	for (int j=i; j>=1;j--){
		System.out.print(j+" ");
	}
	System.out.println("");
}
	}

}