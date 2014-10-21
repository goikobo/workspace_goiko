
public class principalGoiko {
	
/*
 * http://codehero.co/manejo-de-excepciones-parte/
 * http://www2.uah.es/jcaceres/cursos/java/archivos/temas/cursoJava_8.pdf
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// código que puede provocar errores
			int[] vectorNums = new int[5];
			vectorNums[5] = 10;
			
		}catch(ArrayIndexOutOfBoundsException e){
			//este codigo se ejeutará si se ha producido un error de fuera de rango de array
		}
		catch(Exception e){
			//Gestión de la excepción
			
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}finally{
			//este código se ejecutará SIEMPRE
			
		}
		

	}

}