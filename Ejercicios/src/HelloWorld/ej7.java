package HelloWorld;
import java.util.Scanner;

public class ej7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce tu nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Introduce tu dirección: ");
	        String direccion = sc.nextLine();

	        System.out.print("Introduce tu numero: ");
	        String telefono = sc.nextLine();

	        System.out.println("Datos:");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Teléfono: " + telefono);

	        sc.close();
	    }
	}


