/*
 * Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:
 * 
Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.

Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.

Entrega algunos Videojuegos y Series con el método entregar().

Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.

Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).

 */
public class principal {

	public static void main(String[] args) {


		Entregable[] arraySeries = new Serie[5]; //interfaz[] objeto = new nombre_variable[]
		Entregable[] arrayVideojuegos = new Videojuego[5];
		

		arraySeries[0] = new Serie("Falling Skies", 4, "sci-fi", "Josh Wedon");
		arraySeries[1] = new Serie("Falling Skies", 4, "sci-fi", "Josh Wedon");
		arraySeries[2] = new Serie("Falling Skies", 4, "sci-fi", "Josh Wedon");
		arraySeries[3] = new Serie("Falling Skies", "Josh Wedon");
		arraySeries[4] = new Serie();
		
		arrayVideojuegos[0] = new Videojuego("doom", 10, "terror", "id-software");
		arrayVideojuegos[1] = new Videojuego("doom", 10, "terror", "id-software");
		arrayVideojuegos[2] = new Videojuego("doom", 10, "terror", "id-software");
		arrayVideojuegos[3] = new Videojuego("doom", 10, "terror", "id-software");
		arrayVideojuegos[4] = new Videojuego();
		
		for (int i = 0; i<5;i++){
			if (arraySeries[i].isEntregado()){
				//Serie s = (Serie)arraySeries[i];
				System.out.println(arraySeries[i].getTitulo());
			}
		}
		
		
		
		
		

	}

}
