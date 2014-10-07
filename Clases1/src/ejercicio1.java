import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// pide el nombre, apellidos y edad de 3 personas.
		Persona[] arrayPersonas = new Persona[3];
		Scanner entrada  = new Scanner(System.in);
		for (int i=0; i<3; i++){
			//por cada posición del array tengo que indicarle qué tipo de objeto es (persona)
			arrayPersonas[i] = new Persona();
			System.out.println("Introduce el nombre "+ i);
			arrayPersonas[i].nombre = entrada.next(); // esto es accesible porque el aspecto está declarado como publico
			System.out.println("Introduce el apellido "+ i);
			arrayPersonas[i].setApellidos(entrada.next()); //esto no es accesible por ser private.
			System.out.println("Introduce la edad de " + i);
			arrayPersonas[i].edad = entrada.nextInt();
			System.out.println();
			
			
		}
		for (int i=0; i<3; i++){
			System.out.println("nombre: "+ arrayPersonas[i].nombre+" apellido "+arrayPersonas[i].apellidos+ "edad "+arrayPersonas[i].edad);
		}

	}

}
