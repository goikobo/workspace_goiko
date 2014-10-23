/**
 * 
 */

/**
 * @author alumno214
 *
 */
public class principal {

	/**
	 * 
	 */
	public principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Persona[] arrayEmpleados = new empleados[5];
	Persona[] arrayClientes = new cliente[5];
	empresa[] arrayEmpresas = new empresa[2];
	arrayEmpleados[1] = new empleados("nombre", "apellidos", "direccion", "dpto", 150);
	arrayEmpleados[2] = new empleados("nombre2", "apellidos2", "direccion", "dpto", 150);
	arrayEmpleados[0] = new empleados("nombre0", "apellidos0");
	arrayEmpleados[3] = new empleados("nombre3", "apellidos3");
	arrayEmpleados[4] = new empleados("nombre4", "apellidos4");
	
	arrayClientes[0] = new cliente("nombre0", "apellidos0");
	arrayClientes[1] = new cliente("nombre1", "apellidos1");
	arrayClientes[2] = new cliente("nombre2", "apellidos2");
	arrayClientes[3] = new cliente("nombre3", "apellidos3");
	arrayClientes[4] = new cliente("nombre4", "apellidos4");
	
	arrayEmpresas[0] = new empresa("nombreEmpresa", "direccionPostal", 1024);
	arrayEmpresas[1] = new empresa("nombreEmpresa", "direccionPostal", 1024);
	
	
	
	
	

	}

}
