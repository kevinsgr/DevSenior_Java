package Modulo01.Clase02;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa la longitud del rectangulo: ");
                double Longitud = scanner.nextDouble();

            System.out.println("Ingresa el ancho del rectangulo: ");
                double Ancho = scanner.nextDouble();
            
        System.out.printf("El area del rectangulo es de: %.2f cm.%n", Longitud * Ancho);
        System.out.printf("El perímetro del rectangulo es de: %.2f cm.%n", 2 * (Longitud + Ancho));
    
        scanner.close();
    }
    
}
