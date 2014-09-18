
public class bucles {

	public static void main(String[] args) {
		// bucles (while / for) 
		int cont = 0;
		// este condicional comprueba primero la condicion, así que puede no ejecutarse.
		while (cont <10){
			System.out.println("hola "+cont);
			cont = cont +1; // esto es lo mismo cont++;
		}
		for (int i=0; i<10;i++){
			System.out.println(i + " adios");
		}
		// do while. Por lo menos, se ejecuta una vez.
		cont = 0;
		do {
			System.out.println(cont + " hola2");
			cont++;
		}while (cont <10);
	}
}
