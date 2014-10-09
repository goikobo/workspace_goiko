import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dame nombre, edad, sexo, peso y altura");
	
		Scanner entrada = new Scanner(System.in);
		Persona p1 = new Persona(entrada.next(), entrada.nextInt(), entrada.next().charAt(0), entrada.nextDouble(), entrada.nextDouble());
		System.out.println("Dame nombre, edad, Sexo");
		Persona p2 = new Persona(entrada.next(), entrada.nextInt(), entrada.next().charAt(0));
		Persona p3 = new Persona();
		System.out.println("Dame nombre, edad, sexo");
		p3.setNombre(entrada.next());
		p3.setEdad(entrada.nextInt());
		p3.setSexo(entrada.next().charAt(0));
		
		if (p1.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p1.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else {
			System.out.println("Está por encima");
		}
		if (p2.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p2.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else {
			System.out.println("Está por encima");
		}
		if (p3.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p3.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else {
			System.out.println("Está por encima");
		}
		
		if (p1.esMayorDeEdad()){
			System.out.println("P1 Mayor de edad");
		}else {
			System.out.println("P1 Menor de edad");
		}
		if (p1.esMayorDeEdad()){
			System.out.println("p2 Mayor de edad");
		}else {
			System.out.println("p2 Menor de edad");
		}if (p1.esMayorDeEdad()){
			System.out.println("p3 Mayor de edad");
		}else {
			System.out.println("p3 Menor de edad");
		}
		
		for (int i=1; i<4;i++){
			System.out.println(p[i].getNombre()+"tiene "+p[i].getEdad());
		}
		
		
		entrada.close();
	}
	
}
