import java.util.Scanner;


public class sumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primerNumero;
		int segundoNumero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduce el primer número");
		primerNumero = entrada.nextInt();
		//primerNumero = integer.parseInt(entrada.nextline(); // esto convierte la entrada de texto recibida en int
		System.out.println("introduce el segundo numero");
		segundoNumero = entrada.nextInt();
		int resultado = primerNumero + segundoNumero;
		System.out.println("el resultado es "+ resultado);
		entrada.close(); // sirve para cerrar la entrada de teclado, el evento Scanner
	}

}
