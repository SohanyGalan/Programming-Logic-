/*
Ejercicio 5: Verificación de Mayoría de Edad
Crea un programa que determine si una persona es mayor de edad.

Instrucciones:
1. Define una constante MAYORIA_EDAD con el valor de 18.
2. Solicita al usuario su edad.
3. Evalúa:
- Si la edad es mayor o igual a MAYORIA_EDAD, muestra "Eres mayor de edad".
- Si la edad es menor, muestra "Eres menor de edad".
*/

package Ejercicios_para_practicar;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        final int MAYORIA_EDAD = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad >= MAYORIA_EDAD) {
            System.out.println("Eres mayor de edad");
        }

        else if (edad < MAYORIA_EDAD) {
            System.out.println("Eres menor de edad");
        }
        

    }
}
