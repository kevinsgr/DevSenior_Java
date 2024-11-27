package Modulo01.Clase02;

import java.util.Scanner;

public class Ejercicio09 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digita la temperatura en grados Celsius: ");
            Double Celsius = scanner.nextDouble() ;

            System.out.println("---CONVERSION DE TEMPERATURA---");
            System.out.printf("En grados Fahrenheit: %.2f%n", Celsius*(9/5)+32);
            System.out.printf("En grados Kelvin: %.2f%n", Celsius+273.15);


            scanner.close();
        }


}
