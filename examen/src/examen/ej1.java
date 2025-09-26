package examen;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primero numero: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3.0;


        System.out.println("Media: " + media);

        sc.close();
    }
	

}
