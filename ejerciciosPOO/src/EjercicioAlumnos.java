
public class EjercicioAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 =new Persona("paco", 45,'H');
		
		Alumno a1 = new Alumno ("patxi", 24, 'H');
		
		a1.matricular(); //uso el m�todo matricular para la clase Alumno
		
		System.out.println(a1.getNombre()+" est� matriculado en "+ a1.getAsignaturas()+" asignaturas.");
		
		

	}

}
