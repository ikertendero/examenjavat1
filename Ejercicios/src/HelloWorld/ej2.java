package HelloWorld;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu edad ");
		int edad = sc.nextInt();
		
		edad = edad + 1;
		System.out.print("El año que viene tendrás " + edad + " años");
		sc.close();
	}
}
