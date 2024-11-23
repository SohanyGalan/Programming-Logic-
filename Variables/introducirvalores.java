package Variables;

import java.util.Scanner;

public class introducirvalores {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("proporcione un nombre");
        var cadena = console.nextLine();
        console.close();

        System.out.println("hola " + cadena);

    }
}

