
public class ejer2Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empleado empleado = new Empleado("javier","porras","desarrollador", 18000);
System.out.println("el sueldo inicial es "+ empleado.getSueldo());
empleado.aplicarPlus();
System.out.println("el sueldo final es "+ empleado.getSueldo());
	}

}
