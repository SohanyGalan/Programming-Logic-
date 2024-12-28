/*
Ejercicio 6: Conversión de Temperatura
Crea un programa que convierta una temperatura de grados Celsius a grados Fahrenheit.

Instrucciones:
1. Define una constante FACTOR_CONVERSION con el valor 9.0 / 5.0.
2. Solicita al usuario que ingrese una temperatura en grados Celsius.
3. Aplica la fórmula para convertir Celsius a Fahrenheit:
Fahrenheit = (Celsius * FACTOR_CONVERSION) + 32
4. Muestra la temperatura convertida en grados Fahrenheit.
*/



package Ejercicios_para_practicar;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        final double FACTOR_CONVERSION = 9.0 / 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * FACTOR_CONVERSION) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}

