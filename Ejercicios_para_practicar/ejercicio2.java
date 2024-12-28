/*
        Ejercicio 2:
        Conversión de Monedas
        Crea un programa que convierta de dólares a pesos dominicanos usando una constante para la tasa de cambio.

        Instrucciones:
        1. Define una constante TASA_DE_CAMBIO (por ejemplo, 1 USD = 56.5 DOP).
        2. Solicita al usuario la cantidad en dólares.
        3. Calcula y muestra el equivalente en pesos.
        */

        package Ejercicios_para_practicar;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TASA_DE_CAMBIO = 56.5;

        System.out.println("Introduce la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        double pesos = dolares * TASA_DE_CAMBIO;

        System.out.println("La cantidad en pesos es: " + pesos);
    
    }
}