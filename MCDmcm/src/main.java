/*
 * 1.- M�ximo com�n divisor y m�nimo com�n m�ltiplo de dos n�meros
 * En matem�ticas, se define el m�ximo com�n divisor(MCD) de dos o m�s n�meros enteros al mayor n�mero entero
 *  que los divide sin dejar resto.
 *  
 *  En matem�ticas, el m�nimo com�n m�ltiplo (abreviado m.c.m), de dos o m�s n�meros naturales es el menor
 *  n�mero natural que es m�ltiplo de todos ellos. S�lo se aplica con n�meros naturales, es decir, no se usan 
 *  decimales, n�meros negativos o n�meros complejos.
 */
public class main {
	

	/** Funcion que devuelve el M�ximo Com�n Divisor de dos n�meros usando un for
	 * @param a
	 * @param b
	 * @return
	 */
	public static int MCDfor(int a, int b){
		int resultado = Math.min(a, b);
		// con un for
		for (int i= resultado; i>1;i--){
			if ((a%i == 0) && (b%i==0)){
				return i;
			}
		}return 1;
	}
	/** Funcion que devuelve el M�ximo Com�n Divisor de dos n�meros usando un while
	 * @param a
	 * @param b
	 * @return
	 */
	public static int MCDwhile(int a, int b){
		int resultado = Math.min(a, b);
		while ((a%resultado!=0)||(b%resultado!=0)){
			resultado--;
		
		}return resultado;
	}
	/** Funcion que devuelve el M�nimo Com�n M�ltiplo de dos n�meros usando la funci�n MCDfor();
	 * @param a
	 * @param b
	 * @return
	 */	
	public static int mcm(int a, int b){
		return ((a*b)/MCDfor(a, b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MCDwhile(56, 42));
		System.out.println(mcm(56, 42));

	}

}
