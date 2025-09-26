package HelloWorld;

import java.util.Scanner;

public class ej13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean lluvia;
        boolean tareas;
        boolean biblio;
        boolean sale;
        
        System.out.println("Hay lluvia?");
        lluvia = sc.nextBoolean();
        
        System.out.println("Ha terminado las tareas?");
        tareas = sc.nextBoolean();
        
        System.out.println("Va a la biblioteca?");
        biblio = sc.nextBoolean();
        
        sale = (!lluvia && tareas) || biblio;
       
        System.out.println("Puede salir? " + sale);
        
        }
}
