package HelloWorld;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el año actual ");
		int year = sc.nextInt();
		
		System.out.print("Introduce tu edad ");
		int edad = sc.nextInt();
		
		int resultado;
		
		resultado = year - edad;
		
		System.out.print("Naciste en el " + resultado);
		sc.close();
	}
}
