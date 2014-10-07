import java.util.Scanner;


public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// pide el nombre, apellidos y edad de 3 personas. La salida los muestra ordenados por edad
		Persona[] arrayPersonas = new Persona[3];
		Scanner entrada  = new Scanner(System.in);
		for (int i=0; i<3; i++){
			//por cada posición del array tengo que indicarle qué tipo de objeto es (persona)

			/* Persona persona = new Persona();
			 * Persona persona = new Persona();
			 * persona.nombre =entrada.nextLine();
			 * persona.apellidos = entrada.nextLine();
			 * persona.edad = entrda.nextInt();
			 * arrayPersonas[i]=persona;
			 */
			arrayPersonas[i] = new Persona();
			System.out.println("Introduce el nombre "+ i);
			arrayPersonas[i].nombre = entrada.next();
			System.out.println("Introduce el apellido "+ i);
			arrayPersonas[i].apellidos = entrada.next();
			System.out.println("Introduce la edad de " + i);
			arrayPersonas[i].edad = entrada.nextInt();
			
			
		}
		for (int i=0; i<3; i++){
			int edad = 0; 
			if (arrayPersonas[i].edad>edad){
				
			}
			
			System.out.println("nombre: "+ arrayPersonas[i].nombre+" apellido "+arrayPersonas[i].apellidos+ "edad "+arrayPersonas[i].edad);
		}
	}

}
