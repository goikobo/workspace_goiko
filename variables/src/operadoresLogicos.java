import java.util.Scanner;


public class operadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// programa que pregunta la edad y te dice si eres mayor, menor o jubilado usando operadores logicos
int edad = 0; 
/*
 * La estructura del operador ternario ?: es la siguiente:
 * resultado = (condicion)?valor1:valor2;
 * mayor=(x>y)?x:y;
 */
Scanner entrada = new Scanner(System.in);
System.out.println("Introduce tu edad");

edad = entrada.nextInt();

if (edad <= 18){
	System.out.println("Eres menor de edad");
}else if (edad >=18 && edad <67){
	System.out.println("Eres mayor de edad");
}else {
	System.out.println("Eres jubilado");
}
	}

}