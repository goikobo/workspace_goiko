
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cuadrado cuadrado1 = new Cuadrado(2); // invocando directamente a la clase Cuadrado
Figura cuadrado2 = new Cuadrado(2); //usando la interfaz

System.out.println(cuadrado2.calcularSuperficie());
System.out.println(cuadrado1.calcularSuperficie());

	}

}
