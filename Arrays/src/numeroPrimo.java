import java.util.Scanner;


public class numeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// nos pide que introduzcamos un número y comprueba si es primo
Scanner entrada = new Scanner(System.in);
System.out.println("Introduce un número: ");
int numero = entrada.nextInt();
int contador = 2;
boolean primo = true;
while ((primo)&& (contador!=numero)){
	if (numero%contador == 0){
		primo = false;
	contador++;
	System.out.println("No es primo");
	}
}
}
}
