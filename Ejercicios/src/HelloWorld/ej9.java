package HelloWorld;
import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        boolean mayorDeEdad = edad >= 18;

        System.out.println(mayorDeEdad);

        sc.close();
    }
}
