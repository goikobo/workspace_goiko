import java.util.Scanner;


public class validarDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni;
		String letraDNI;
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Introduzca su DNI");
		// tengo que validar el dni: 8 d�gitos + 1 letra que est� dentro de la cadena anterior
		dni = entrada.next();
		letraDNI= entrada.charAt(9);
		
	
		entrada.close();	
		
	}

}
