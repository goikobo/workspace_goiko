import java.util.Scanner;


public class desgloseNumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
//declaro las variables que van a guardar el número en formato entero, en string
int num;
String lectura;
int longitud;
System.out.println("introduce un número");
lectura = entrada.nextLine();

// convierto el numero a entero
num=Integer.parseInt(lectura);
//obtengo la cantidad de digitos introdyucidos
longitud = lectura.length();

// por cada digito que contiene el numero introducido
for (int i=0; i<longitud; i++){
	int divisor = (int)Math.pow(10,longitud-1-i);
	System.out.println(num/divisor);
	num=num % divisor;
	}
entrada.close();
	}
}