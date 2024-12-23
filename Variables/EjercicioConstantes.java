//Las constantes en Java se definen usando la palabra clave "final". 
//Esto significa que el valor de esa variable no puede cambiar una vez que se le asigna.

package Variables;  
import java.util.Scanner;

public class EjercicioConstantes {
    // Definir la constante PI
    public static final double PI = 3.14159;

    // Método para calcular el área de un círculo
    public static double calcularArea(double radio) {
        return PI * radio * radio;  // Fórmula del área
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        // Pedir al usuario el radio
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular y mostrar el área
        double area = calcularArea(radio);
        System.out.println("El área del círculo es: " + area);
        }
    
    }