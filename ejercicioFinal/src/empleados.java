/**
 * 
 */

/**
 * @author alumno214
 *
 */
public class empleados extends Persona {
	
	private String direccion;
	private String dpto;
	private int sueldo;

	/**
	 * 
	 */
	public empleados() {
		// TODO Auto-generated constructor stub
		super();
		this.direccion = "";
		this.dpto = "";
		this.sueldo = 0;
	}

	/**
	 * @param nombre
	 * @param apellidos
	 */
	public empleados(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.direccion = "";
		this.dpto = "";
		this.sueldo = 0;
	}
	public empleados(String nombre, String apellidos, String direccion, String dpto, int sueldo) {
		super(nombre, apellidos);
		this.direccion = direccion;
		this.dpto = dpto;
		this.sueldo = sueldo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dpto
	 */
	public String getDpto() {
		return dpto;
	}

	/**
	 * @param dpto the dpto to set
	 */
	public void setDpto(String dpto) {
		this.dpto = dpto;
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
