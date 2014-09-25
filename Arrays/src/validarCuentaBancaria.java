
public class validarCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// http://latecladeescape.com/t/validar+un+numero+de+cuenta
		int[] peso = {1,2,4,8,5,10,9,7,3,6}; //segun la web, hay que asignar a cada posicion un peso
		String cuenta = "9080-12340-10-000102030";
		//parseo la cadena y voy sacando los datos que me interesan. Oficina contiene 8 caracteres + 00 y 
		//así lo convieerto a cadena de 10 para multiplicar con los valores de peso
		String oficina = "00" + cuenta.substring(0,3) + cuenta.substring(5,10) ;
		String ccliente = cuenta.substring(14,23);
		int valorofi = 0;
		int dc1;
		int dc2;
		int dc=cuenta.substring(11,12);
		
		for (int i = 0; i<peso.length; i++){
			// convertir cada caracgter a valor numerico -> character.getnumericvalue(oficina.cahrat(i)
			valorofi += peso[i] * Character.getNumericValue(oficina.charAt(i));
			
		}
		int resto = 11 - (valorofi%11);
		if (resto==11){
			dc1=0;
		}else if (resto==10){
			dc1=1;
		}else {
			dc1=resto;
		}
		// validar la segunda parte, la del código de cuenta del cliente.
		int suma2 = 0;
		for (int i = 0; i<peso.length; i++){
			// convertir cada caracgter a valor numerico -> character.getnumericvalue(oficina.cahrat(i)
			suma2 += peso[i] * Character.getNumericValue(ccliente.charAt(i));
			
		}
		
		resto = 11 - (valorofi%11);
		if (resto==11){
			dc2=0;
		}else if (resto==10){
			dc2=1;
		}else {
			dc2=resto;
		}
		
		
		if ((""+dc1+dc2).equals(dc)){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		
	}

}