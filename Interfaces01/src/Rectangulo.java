
public class Rectangulo implements Figura {

	private float ladoA;
	private float ladoB;
	

	public Rectangulo(){}
		
		public Rectangulo(float ladoA, float ladoB){
			this.ladoA = ladoA;
			this.ladoB = ladoB;
		}
	
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return this.ladoA*this.ladoB;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.ladoA*2 + this.ladoB*2);
	}

	@Override
	public String tipoFigura() {
		// TODO Auto-generated method stub
		return "Soy un Rectángulo";
	}

}
