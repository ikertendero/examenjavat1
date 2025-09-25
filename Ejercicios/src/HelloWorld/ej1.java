package HelloWorld;
import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        
        System.out.println("Has introducido el número: " + numero);
        sc.close();
	}
}
