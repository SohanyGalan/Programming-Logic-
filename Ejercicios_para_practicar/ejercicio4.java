/*
Ejercicio 4: Clasificación de Estados
Crea un programa que clasifique un número como positivo, negativo o cero.

Instrucciones:
1. Solicita al usuario un número entero.
2. Evalúa el número ingresado:
- Si es mayor que 0, clasifícalo como "positivo".
- Si es menor que 0, clasifícalo como "negativo".
- Si es igual a 0, clasifícalo como "cero".
3. Muestra el resultado de la clasificación.
*/

package Ejercicios_para_practicar;

public class ejercicio4 {
public static void main(String[] args) {
    int numero = 0;

    if (numero >0) {
        System.out.println("El numero es positivo");
    }
    else if (numero <0) {
        System.out.println("El numero es negativo");
    }
    else if (numero ==0 ){
        System.out.println("El numero es cero");
    }
}
}
