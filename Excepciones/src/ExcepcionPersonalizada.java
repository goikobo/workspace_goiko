
public class ExcepcionPersonalizada extends Exception {
	
	public ExcepcionPersonalizada(){
		super("el n�mero debe ser positivo");
	}
	
	public ExcepcionPersonalizada(String mensaje){
		super(mensaje);
	}
	
}