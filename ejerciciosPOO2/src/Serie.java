/*
 * 4)�Crearemos una clase llamada�Serie�con las siguientes caracter�sticas:
 * 
 * Sus atributos son�titulo, numero de temporadas,�entregado, genero y creador.
 * Por defecto, el numero de temporadas es de 3 temporadas y entregado�false. 
 * El resto de atributos ser�n valores por defecto seg�n el tipo del atributo.
 * 
 * Los constructores que se implementaran ser�n:
 * Un constructor por defecto.
 * Un constructor con el titulo y creador. El resto por defecto.
 * Un constructor con todos los atributos, excepto de entregado.
 * 
 * Los m�todos que se implementara ser�n:
 * 
 * M�todos get de todos los atributos, excepto de entregado.
 * M�todos set de todos los atributos, excepto de entregado.
 * 
 * Sobrescribe los m�todos toString.
 */


public class Serie implements Entregable {
	
	private String titulo; 
	private int ntemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	
	/**
	 * @param titulo
	 * @param ntemporadas
	 * @param entregado
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int ntemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.ntemporadas = ntemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}


	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie() {
		this.titulo = "";
		this.ntemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @param ntemporadas the ntemporadas to set
	 */
	public void setNtemporadas(int ntemporadas) {
		this.ntemporadas = ntemporadas;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @return the ntemporadas
	 */
	public int getNtemporadas() {
		return ntemporadas;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", ntemporadas=" + ntemporadas
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
		
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
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
