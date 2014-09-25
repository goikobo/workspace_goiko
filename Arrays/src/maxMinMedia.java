
public class maxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int [5]; //declaramos el array
		int sumaAnterior = 0;
		for (int i=0; i<numero.length;i++){
			double resultado = Math.random()*10;
			numero[i] = (int)resultado;	
			System.out.println(numero[i]);
			//sumaAnterior = sumaAnterior + numero[i];
			sumaAnterior += numero[i];
			
			if (i==4){
				System.out.println("la suma es :"+sumaAnterior/numero.length);}
			// Arrays.sort(numero);
			}
		
		String frase = "hola que tal estás";
		// saca por pantalla el caracter de la cadena en la posición que se indique(2)

		System.out.println(frase.charAt(2));
		// saca por pantalla la posición de la cadena en la que aparezca por primera vez el carácter que se le indique (a) 
		System.out.println(frase.indexOf("a"));
		System.out.println(frase.indexOf("a", 5)); //lo mismo que la anterior pero a partir de la posición 5
		System.out.println(frase.lastIndexOf ("a")); // devuelve la última posición del carácter
		}
}
 
