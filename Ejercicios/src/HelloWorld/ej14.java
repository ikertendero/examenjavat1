package HelloWorld;
import java.util.Scanner;

public class ej14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota del primer trimestre: ");
        int nota1 = sc.nextInt();

        System.out.print("Nota del segundo trimestre: ");
        int nota2 = sc.nextInt();

        System.out.print("Nota del tercer trimestre: ");
        int nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        double mediaex = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Nota de boletin: " + media);

        System.out.println("Nota de expediente: " + mediaex);

        sc.close();
    }
}
