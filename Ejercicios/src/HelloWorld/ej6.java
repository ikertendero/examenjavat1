package HelloWorld;
import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        
        System.out.println("Suma " + suma);
        System.out.println("Resta " + resta);
        System.out.println("Multiplicacion " + mult);
        System.out.println("Division " + div);
        
        sc.close();
	}
}
