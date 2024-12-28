
import java.util.Scanner;

public class ejerciciotipodedatos {

    public static void main(String[] args) {

        try (var consola = new Scanner(System.in)) {

            System.out.println("ingrese su nombre: " + "nombre");
            var nombre = consola.nextLine();

            System.out.println("ingrese su edad" + "edad");
            var edad = Integer.parseInt(consola.nextLine());

            System.out.println("ingrese su sueldo (USD): ");
            var sueldo = Float.parseFloat(consola.nextLine());
            
            System.out.println("eres un empleado de confianza (true/false): ");
            var confianza = Boolean.parseBoolean(consola.nextLine());

        }
    }
}
