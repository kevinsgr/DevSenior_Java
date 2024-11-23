package Modulo01.Clase01;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner (System.in); 
        
      System.out.println("Introduzca la primera palabra:");
      String Palabra1 = scanner.nextLine();

      System.out.println("Introduzca la segunda palabra:");
      String palabra2 = scanner.nextLine();

      System.out.println("Introduzca la tercera palabra:");
      String palabra3 = scanner.nextLine();

        System.out.printf("%s %s %s", Palabra1, palabra2, palabra3);
            scanner.close();

    }
    
}
