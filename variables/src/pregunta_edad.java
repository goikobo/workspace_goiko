import java.util.Scanner;


public class pregunta_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// programa que pregunta la edad y te dice si eres mayor, menor o jubilado
int edad = 0; 
Scanner entrada = new Scanner(System.in);
System.out.println("Introduce tu edad");
edad = entrada.nextInt();
if (edad <= 18){
	System.out.println("Eres menor de edad");
}else if (edad <=64){
	System.out.println("Eres mayor de edad");
}else {
	System.out.println("Eres jubilado");
}
	}

}
