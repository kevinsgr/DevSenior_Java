package Modulo01.Clase02;

import java.util.Scanner;

public class Ejercicio07 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);    
        

        System.out.println("Digita el primer número: ");
        double PrimerNumero = scanner.nextDouble();

        System.out.println("Digita el segundo número: ");
        double SegundoNumero = scanner.nextDouble();
        

        System.out.printf("Suma: %.2f%n", PrimerNumero + SegundoNumero);
        System.out.printf("Resta: %.2f%n", PrimerNumero - SegundoNumero);
        System.out.printf("Multiplicación: %.2f%n", PrimerNumero * SegundoNumero);
        System.out.printf("División: %.2f%n", PrimerNumero/SegundoNumero);
       

        scanner.close();
        

    }
    
}
