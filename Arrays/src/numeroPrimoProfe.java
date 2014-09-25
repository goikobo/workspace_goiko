import java.util.Scanner;


public class numeroPrimoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("introduce un numero");
Scanner entrada = new Scanner(System.in);
int num = entrada.nextInt();

boolean esPrimo = true; 
for (int i=2;i<num;i++){
	if (num%i==0){
		esPrimo = false;
	}
}

if (esPrimo){
	System.out.println("El número es primo");
}else{
	System.out.println("El número no es primo");
}
	}

}
