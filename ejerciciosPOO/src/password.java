
public class password {
	private int longitud;
	private String contrasena;
	
	private String cars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*.;?¿$%&#_()-|[]<>/+";
	
	public int Password(){
		this.longitud = 8;
	}

	
	public int Password(int longitud){
		this.longitud = longitud;
	}
	
	public void generarPassword(){
		String pass="";
	for (int i= 0;i<this.longitud;i++){
		int pos = (int) Math.random()*cars.length();
		pass = pass+cars.charAt(pos);
		// pass  =cars.charAt((int) Math.random()*cars.length());
		// pass += cars.charAt(pos);
	}
	this.contrasena=pass;
	}
	
	public boolean esFuerte(){
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		int simbolos = 0;
		
		for (int i= 0;i<this.longitud;i++){
			
			if (this.contrasena.charAt(i)>='A'&&this.contrasena.charAt(i)<='Z'){
				mayusculas++;
			}else if (Character.isLowerCase(this.contrasena.charAt(i))){
				minusculas++;
			}else if (Character.isDigit(this.contrasena.charAt(i))){
				numeros++;
			}else {
				simbolos++;
			}
			
		
	}
//		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String minus = "abcdefghijklmnopqrstuvwxyz";
//		String numeros = "0123456789";
//		String especiales = "*.;?¿$%&#_()-|[]<>/+";
//		for (){
//		return 1;
		
	}
}