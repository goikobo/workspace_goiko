import java.util.Scanner;


public class ordenar3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ejercicio: pide 3 n�meros y los ordenad de mayor a menor.
		
	int cont = 2;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Te voy a pedir "+cont+" n�meros");
	while (cont <3){
		cont = cont +1;
		System.out.println("Introduce el numero "+cont);
		cont = cont -1;
		cont = entrada.nextInt();
		cont = cont +1; // esto es lo mismo cont++;
		
	}
	entrada.close();
	
	}

}