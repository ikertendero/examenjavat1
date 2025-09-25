package HelloWorld;
import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Introduce la segunda nota: ");
        int nota2 = sc.nextInt();

        double media = (nota1 + nota2) / 2.0;
        
        System.out.println("La media es un: " + media);

        sc.close();
    }
}
