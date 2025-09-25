package HelloWorld;
import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        boolean esPar = numero % 2 == 0; 

        System.out.println(esPar);

        sc.close();
    }
}
