/*
 * Crearemos una clase Videojuego con las siguientes características:
 * Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
 * Por defecto, las horas estimadas serán de 10 horas y entregado false.
 * El resto de atributos serán valores por defecto según el tipo del atributo.
 * 
 * Los constructores que se implementaran serán:
 * Un constructor por defecto.
 * Un constructor con el titulo y horas estimadas. El resto por defecto.
 * Un constructor con todos los atributos, excepto de entregado.
 * 
 * Los métodos que se implementara serán:
 * Métodos get de todos los atributos, excepto de entregado.
 * Métodos set de todos los atributos, excepto de entregado.
 * 
 * Sobrescribe los métodos toString.
 */


public class Videojuego implements Entregable {
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compania;
	protected final int HORAS_ESTIMADAS=10;
	
	public Videojuego() {
		// TODO Auto-generated constructor stub
		this.titulo = "";
		this.horas = HORAS_ESTIMADAS;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	/**
	 * @param titulo
	 * @param horas
	 * @param entregado
	 * @param genero
	 * @param compania
	 */
	public Videojuego(String titulo, int horas, String genero, String compania) {

		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compania = compania;
	}

	public Videojuego(String titulo, int horas) {
		this();
		this.titulo = titulo;
		this.horas = horas;
		
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * @return the hORAS_ESTIMADAS
	 */
	public int getHORAS_ESTIMADAS() {
		return HORAS_ESTIMADAS;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas
				+ ", entregado=" + entregado + ", genero=" + genero
				+ ", compania=" + compania + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
	
		return this.entregado;
	}


	@Override
	public String setTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		return 0;
	}



}
