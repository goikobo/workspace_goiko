import java.util.Scanner;

import clases.Persona;

public class principal {

	public static void main(String[] args) {
		/*Persona persona1 = new Persona();
		persona1.nombre = "javi";
		persona1.apellidos = "heras";
		persona1.edad = 35;*/
		Persona persona1 = new Persona("javi","heras",35);
		
		Persona persona2 = new Persona();
		persona2.setNombre("paco");
		persona2.apellidos = "perez";
		persona2.edad = 45;
		
		Persona persona3 = new Persona();
		persona3.nombre = "Silvia";
		persona3.apellidos = "Gutierrez";
		persona3.edad = 27;
		
		Persona[] arrayPersonas = new Persona[10];
		
		Scanner entrada = new Scanner(System.in);
		
		
		for (int i=0;i<10;i++){
			Persona persona = new Persona();
			persona.nombre = entrada.next();
			persona.apellidos = entrada.next();
			persona.edad = entrada.nextInt();
			
			arrayPersonas[i] = persona;
			
		}
		
		
		
		//pregunto si num1 es el mayor de todos
				if (persona1.edad > persona2.edad && persona1.edad>persona3.edad){
					//si lo es, entonces quiero saber si num2 es mayor que num3
					if (persona2.edad>persona3.edad){
						System.out.println(persona1.nombre + " " +persona2.nombre + " "+persona3.nombre);
					//si num2 no es mayor que num3
					}else{
						System.out.println(persona1.nombre + " " +persona3.nombre + " "+persona2.nombre);
					}
				}else if (persona2.edad>persona1.edad && persona2.edad>persona3.edad){
					if (persona1.edad>persona3.edad){
						System.out.println(persona2.nombre + " " +persona1.nombre + " " +persona3.nombre);
					}else{
						System.out.println(persona2.nombre + " " +persona3.nombre + " " +persona1.nombre);
					}
				}else{
					if (persona1.edad>persona2.edad){
						System.out.println(persona3.nombre + " " +persona1.nombre+ " " +persona2.nombre);
					}else{
						System.out.println(persona3.nombre + " " +persona2.nombre + " " +persona1.nombre);
					}
				}
		
		
		
		

	}

}
