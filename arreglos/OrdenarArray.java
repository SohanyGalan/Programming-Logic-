package arreglos;
import java.util.Arrays;
import java.util.Collections;

public class OrdenarArray {
    public static void main(String[] args) {
        // Array original
        Integer[] numeros = {5, 3, 8, 1, 2};

        // Ordenar en orden ascendente
        Arrays.sort(numeros);
        System.out.println("Orden Ascendente: " + Arrays.toString(numeros));

        // Ordenar en orden descendente
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Orden Descendente: " + Arrays.toString(numeros));
    }
}
