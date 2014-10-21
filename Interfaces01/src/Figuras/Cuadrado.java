package Figuras;

public class Cuadrado implements Figura {
	
	private float lado;
	
	public Cuadrado(){
		
	}
	
	public Cuadrado (float lado){
		this.lado = lado;
	}

	@Override
	public float calcularSuperficie() {
			return (float)Math.pow(this.lado, 2);

	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public String tipoFigura() {
		// TODO Auto-generated method stub
		return "soy un cuadrado";
	}



}
