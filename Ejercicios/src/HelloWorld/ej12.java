package HelloWorld;
import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pmanzanas = 2.35;
		double pperas = 1.95;
		
		System.out.print("Introduce tus kilos de manzanas: ");
		double kmanzanas = sc.nextInt();
		
		System.out.print("Introduce tus kilos de peras: ");
		double kperas = sc.nextInt();
		
		double imanzanas = kmanzanas * pmanzanas;
		double iperas = kperas * pperas;
		double total = imanzanas + iperas;
		
		System.out.print("El precio total es: " + total);

		sc.close();
	}
}
