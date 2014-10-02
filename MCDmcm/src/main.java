/*
 * 1.- Máximo común divisor y mínimo común múltiplo de dos números
 * En matemáticas, se define el máximo común divisor(MCD) de dos o más números enteros al mayor número entero
 *  que los divide sin dejar resto.
 *  
 *  En matemáticas, el mínimo común múltiplo (abreviado m.c.m), de dos o más números naturales es el menor
 *  número natural que es múltiplo de todos ellos. Sólo se aplica con números naturales, es decir, no se usan 
 *  decimales, números negativos o números complejos.
 */
public class main {
	

	/** Funcion que devuelve el Máximo Común Divisor de dos números usando un for
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
	/** Funcion que devuelve el Máximo Común Divisor de dos números usando un while
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
	/** Funcion que devuelve el Mínimo Común Múltiplo de dos números usando la función MCDfor();
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
