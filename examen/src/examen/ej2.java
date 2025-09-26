package examen;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int horas;
	double phora;
	double sbruto;
	double sneto;
	
	System.out.println("Cuantas horas has trabajado?");
	horas = sc.nextInt();
	
	System.out.println("Cuanto cobras por hora?");
	phora = sc.nextDouble();
			
	sbruto = horas * phora;
	
	sneto = sbruto < 1000 ? sbruto - (sbruto * 0.10)  : sbruto - (sbruto * 0.15);
	
	System.out.println("Tu salario neto será: " + sneto);
	}

}
