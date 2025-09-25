package HelloWorld;
import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;       
        double area = Math.PI * Math.pow(radio, 2);  

        System.out.println("La longitud es: " + longitud);
        System.out.println("El área es: " + area);

        sc.close();
    }
}
