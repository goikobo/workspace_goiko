/**
 * 
 */

/**
 * @author alumno214
 *
 */
public class cliente extends Persona {
	
	private String tfnoContacto;
	protected String nombreEmpresa;

	/**
	 * 
	 */
	public cliente() {
		// TODO Auto-generated constructor stub
		super();
		this.tfnoContacto = "";
		this.nombreEmpresa = "";
	}

	/**
	 * @param nombre
	 * @param apellidos
	 */
	public cliente(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.tfnoContacto = "";
		this.nombreEmpresa = "";
	}

	/**
	 * @return the tfnoContacto
	 */
	public String getTfnoContacto() {
		return tfnoContacto;
	}

	/**
	 * @param tfnoContacto the tfnoContacto to set
	 */
	public void setTfnoContacto(String tfnoContacto) {
		this.tfnoContacto = tfnoContacto;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.nombreEmpresa = empresa;
	}

}
