package HelloWorld;
import java.util.Scanner;

public class ej11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tus pesetas: ");
		double pesetas = sc.nextInt();
		
		double conversion = pesetas / 166;
		
		System.out.println("Tienes " + conversion + " euros");
		sc.close();
	}
	
}
