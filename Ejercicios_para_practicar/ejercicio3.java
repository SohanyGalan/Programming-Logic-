/*
Ejercicio 3: Tabla de Valores IVA
Crea un programa que calcule el precio final de un producto con impuestos usando una constante para la tasa de IVA.

Instrucciones:
1. Define IVA como una constante (por ejemplo, 0.18 para un IVA del 18%).
2. Solicita al usuario el precio de un producto.
3. Calcula y muestra:
- El monto del IVA.
- El precio final (precio + IVA).
*/

package Ejercicios_para_practicar;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double iva = 0.18;

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        double ivaTotal = precio * iva;
        double precioFinal = precio + ivaTotal;

        System.out.println("El precio final es: " + precioFinal);
        System.out.println("El monto del IVA es: " + ivaTotal);
        scanner.close();

    }
}
