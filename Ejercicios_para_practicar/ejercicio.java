package Ejercicios_para_practicar;

// Crea un programa que calcule el área de un círculo utilizando la constante PI.
    // Instrucciones:
    // 1. Define PI como una constante con el valor 3.14159.

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double Pi = 3.14159;

        System.out.println("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Pi * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    
    }
}
