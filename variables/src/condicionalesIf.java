public class condicionalesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//esto es un comentario
/*
 * En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que hab�a un
 *  hidalgo de los de lanza en astillero, adarga antigua y galgo corredor. 
 */
		int num1 = 5;
		int num2 = 6;
		float resultado = 0;
		char op = '-';
		if (op == '+'){
			resultado = num1 + num2;
			System.out.println("La suma es:"+resultado);
			
		}else if (op == '-'){
			resultado = num1 - num2;
			System.out.println("La resta es:"+resultado);
		}else if (op == '*'){
			resultado = num1 * num2;
			System.out.println("La multiplicacion es:"+resultado);
		}else if (op =='/'){
			resultado = num1 / num2;
		System.out.println("La division es:"+resultado);
	}else {
	resultado = 0;
	System.out.println(resultado);
	}
	}
}
