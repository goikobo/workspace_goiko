

public class funciones01 {
	public static int maximo(int[]vector){
		//funcion que busca el valor máximo en un array unidimensional
		int result = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>result){
				result = vector[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// public static int <- funcion que devuelve un entero
		int[] miArray = {3,2,7,9};
		int max = maximo(miArray); //invocamos la funcion para extraer el valor máximo del array miArray y se la paso a max
		System.out.println("valor máximo: "+ max);
		
	}

}
