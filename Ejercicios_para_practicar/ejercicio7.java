/*
Ejercicio 7: Determinar si un número es par o impar
Crea un programa que solicite un número entero al usuario y determine si el número es par o impar.

Instrucciones:
1. Solicita al usuario que introduzca un número entero.
2. Usa la operación módulo (%) para verificar si el número es divisible entre 2.
3. Si el resto es 0, imprime que el número es par; de lo contrario, imprime que es impar.
4. Muestra el resultado en la consola.
 */
package Ejercicios_para_practicar;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        final int numeropar = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int numero = scanner.nextInt();

        if (numero % numeropar == 0) {
            
        }
    }
}
