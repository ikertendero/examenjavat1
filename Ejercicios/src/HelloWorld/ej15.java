package HelloWorld;

import java.util.Scanner;

public class ej15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int iva = 21;
		double precio;
		double precioiva;

		System.out.println("Introduce el precio");
		precio = sc.nextDouble();

		precioiva = precio + precio * iva / 100;

		System.out.println(precioiva);

	}
}
