
public class principalGoiko {
	
/*
 * http://codehero.co/manejo-de-excepciones-parte/
 * http://www2.uah.es/jcaceres/cursos/java/archivos/temas/cursoJava_8.pdf
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// c�digo que puede provocar errores
			int[] vectorNums = new int[5];
			vectorNums[5] = 10;
			
		}catch(ArrayIndexOutOfBoundsException e){
			//este codigo se ejeutar� si se ha producido un error de fuera de rango de array
		}
		catch(Exception e){
			//Gesti�n de la excepci�n
			
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}finally{
			//este c�digo se ejecutar� SIEMPRE
			
		}
		

	}

}