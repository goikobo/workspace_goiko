import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * todo este projecto corresponde al ejercicio 6 que está en "ejercicios POO.docx"
 */

public class principal {

	public static void main(String[] args) {
		//funciones de un ArrayList
		//add - añade un elemento al final del array
		//size - devuelve la longitud del array
		//get(i) - devuelve el elmeento en la posición i
		//indexof(E) - devuelve la posición del elemento E 
		//remove (i) - elimina el elemento en la posición i
		//remove (E) - elimina el elemento E del array
		//clear - borra los elementos del array
		//isEmpty - indica si está vacío o no
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		
		System.out.println("Selecciona una opción");
		System.out.println("0-Salir");
		System.out.println("1-Alta empleado");
		System.out.println("2-Alta clientes");
		System.out.println("3-Alta empresas");
		Scanner entrada = new Scanner(System.in);
		
		int opcion=0;
		do{
			try{
				opcion = entrada.nextInt();
			}catch (InputMismatchException e){
				System.out.println("No has metido un numero");
			}
			switch (opcion) {
			case 1:
				System.out.println("Dame el nombre del empleado");
				String nombre = entrada.next();
				System.out.println("Dame el apellido del empleado");
				String apellido = entrada.next();
				System.out.println("Dame el dni del empleado");
				String dni = entrada.next();
				System.out.println("Dame el direccion del empleado");
				String direccion = entrada.next();
				System.out.println("Dame el departamento del empleado");
				String departamento = entrada.next();
				System.out.println("Dame el sueldo del empleado");
				float sueldo = entrada.nextFloat();
				Empleado emp = new Empleado(nombre, apellido, dni, direccion, departamento, sueldo);
				empleados.add(emp);
				break;
			case 2:
				System.out.println("Dame el nombre del cliente");
				String nombreCliente = entrada.next();
				System.out.println("Dame el apellido del cliente");
				String apellidoCliente = entrada.next();
				System.out.println("Dame el dni del cliente");
				String dniCliente = entrada.next();
				System.out.println("Dame el telefono del cliente");
				String telefonoCliente = entrada.next();
				
				Cliente cliente = new Cliente(nombreCliente, apellidoCliente, dniCliente, telefonoCliente);
				clientes.add(cliente);
				System.out.println ("Selecciona una de las empresas para asociarla al cliente");
				//muestro un listado con las empresas
				for (int i=0;i<empresas.size();i++){
					System.out.println(i+"-"+empresas.get(i).getNombre());
				}
				//leo el indice de la empresa que me han seleccionado
				int indice = entrada.nextInt();
				//asocio esa empresa al cliente
				cliente.setEmpresa(empresas.get(indice));
				break;
			case 3:
				System.out.println("Dame el nombre de la empresa");
				String nombreEmpresa = entrada.next();
				System.out.println("Dame el nif de la empresa");
				String nifEmpresa = entrada.next();
				System.out.println("Dame la direccion de la empresa");
				String direccionEmpresa = entrada.next();
				System.out.println("Dame la facturacion de la empresa");
				float facturacionEmpresa = entrada.nextFloat();
				
				Empresa empresa = new Empresa(nombreEmpresa, nifEmpresa, direccionEmpresa, facturacionEmpresa);
				empresas.add(empresa);
				break;		
			}
		}while(opcion!=0 && opcion<4);
		
		
		

	}

}
