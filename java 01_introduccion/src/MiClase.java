import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// empezamos con las operaciones de entrada y salida por pantalla. La funcion muestra texto por pantalla
		System.out.print("Hello Kitty!!");
			
		// funcion y tipos de variables. 
		// variables en java :integer, string, boolean 
		// integer = n�meros enteros
		// string = cadenas de caracteres
		// boolean = 0/1
		// println() <- imprime y realiza salto de l�nea
		System.out.println("Introduce tu nombre");
		// declaramos la variable entrada que pertenece a la clase scanner y leer� del teclado
		Scanner entrada = new Scanner(System.in);
		// creo una variable para guardar el nombre del usuario
		String nombre = entrada.nextLine();
		System.out.print("hola " +nombre+" qu� tal");
		
	}
} 