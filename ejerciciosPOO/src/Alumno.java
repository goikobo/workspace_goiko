
public class Alumno extends Persona {

	private int asignaturas;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
		this.asignaturas = 0;
	}

	public Alumno(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.asignaturas = 0;
				
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, int edad, char sexo, double peso, double altura) {
		super(nombre, edad, sexo, peso, altura);
		// TODO Auto-generated constructor stub
		this.asignaturas = 0;
	}
	
	public void matricular(){
		this.asignaturas++;
	}

	/**
	 * @return the asignaturas
	 */
	public int getAsignaturas() {
		return asignaturas;
	}

}
