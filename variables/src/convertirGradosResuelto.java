import java.util.Scanner;


public class convertirGradosResuelto {

	public static void main(String[] args) {
		float temp;
		Scanner entrada = new Scanner(System.in);
		String tipo;
		float resultado;
		//controla que el numero introducito este entre 0 y 100
		do{
			System.out.println("Introduce temperatura");
			temp = entrada.nextFloat();
		}while (temp<0 || temp > 100);
		//controla que se elija el tipo de conversion: f o c		
		do{
			System.out.println("Introduce la conversión (f/c)");
			tipo = entrada.next();
		}while (!(tipo.equals("f") || tipo.equals("c")));
		//realiza las operaciones
		if (tipo.equals("f")){
			resultado = 32+(9*temp/5);
		}else{
			resultado = (temp-32)*((float) 1.8);
		}
		
		System.out.println(resultado);
		
	}

}
