import java.util.Random;


public class empresa {
	private String nombreEmpresa;
	private String nif;
	private String direccionPostal;
	private int facturacion;
	
public empresa(){
	this.nombreEmpresa = "";
	this.direccionPostal = "";
	this.facturacion = 0;
	generaNIF();
}
	/**
	 * @param nombreEmpresa
	 * @param nif
	 * @param direccionPostal
	 * @param facturacion
	 */
	public empresa(String nombreEmpresa, String direccionPostal,
			int facturacion) {

		this.nombreEmpresa = nombreEmpresa;
		this.direccionPostal = direccionPostal;
		this.facturacion = facturacion;
		generaNIF();
	}

	private void generaNIF(){
		Random rand = new Random();	
		//rand.nextInt ((max - min) +1) + min
		int num = rand.nextInt((99999999-1000000)+1)+10000000;
		char letra = this.generaLetra(num);
		this.nif = num+"-"+letra;
	}

	private char generaLetra(int nif){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraBuena = letras.charAt(nif % 23);
		return letraBuena;
	}
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}
	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}
	/**
	 * @return the direccionPostal
	 */
	public String getDireccionPostal() {
		return direccionPostal;
	}
	/**
	 * @param direccionPostal the direccionPostal to set
	 */
	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}
	/**
	 * @return the facturacion
	 */
	public int getFacturacion() {
		return facturacion;
	}
	/**
	 * @param facturacion the facturacion to set
	 */
	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}
}
