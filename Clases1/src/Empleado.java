
public class Empleado {
// nombre apellidos puesto salario
	/*
	 * puesto: desarrollador, analista, jefe de equipo, jefe dpto. 
	 * porcentajes: 2%, 5%, 7%, 10%
	 */
	private String nombre;
	private String apellidos; 
	private String puesto;
	private int sueldo; 
	
	public Empleado(){
		this.nombre = "";
		this.apellidos = "";
		this.puesto = "";
		this.sueldo = 0;
}

	public Empleado (String nombre, String apellidos, String puesto, int sueldo){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.puesto = puesto;
		this.sueldo = sueldo;
	}
	
	public void aplicarPlus(){
		switch (this.puesto){
		case "desarrollador":
				this.sueldo = (int)(this.sueldo *1.02);
				break;
		case "analista":
			this.sueldo = (int)(this.sueldo *1.05);
				break;
		case "jefe de equipo":
			this.sueldo = (int)(this.sueldo *1.07);
				break;
		case "jefe dpto":
			this.sueldo = (int)(this.sueldo *1.10);
				break;
					
		}
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}


