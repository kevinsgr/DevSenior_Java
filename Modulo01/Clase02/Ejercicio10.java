package Modulo01.Clase02;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digita el primer numero:");
            Double Num1 = scanner.nextDouble();

            System.out.println("Digita el segundo número:");
            Double Num2 = scanner.nextDouble();

            System.out.println("Digita el tercer número:");
            Double Num3 = scanner.nextDouble();

            Double Suma = Num1 + Num2 + Num3;

            Double Resultado = Suma / 3;

            System.out.printf("La media aritmética de los números ingresados es %.2f", Resultado); 

        scanner.close();
    }
    
}
