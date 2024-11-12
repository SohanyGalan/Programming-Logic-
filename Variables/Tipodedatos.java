package Variables;

public class Tipodedatos {
    public static void main(String[] args) {

        //Se utiliza para almacenar números enteros (sin decimales).
        int entero = 21;
        System.out.println("mi entero es " + entero); 

        //se utiliza para almacenar números enteros grandes que superan el rango del tipo int. 
        long entero2 = 212L;
        System.out.println("mi entero2 es " + entero2);

        //Almacena números con decimales, pero requiere que al final del valor se coloque una "f".
        // Tiene menos precisión que el tipo double.
        float decimales = 21.2f;
        System.out.println("mi decimales es " + decimales);

        // También almacena números con decimales, pero tiene más precisión que float. Es el tipo de dato predeterminado para números decimales.
        double doble = 21.2;
        System.out.println("mi doauble es "+ doble);

        //Almacena un solo carácter, como una letra o símbolo. Debe estar entre comillas simples (' ').
        char caracter = 'a';
        System.out.println("Mi Caracter es "+ caracter);

        // Almacena valores de verdadero (true) o falso (false). Se usa para condiciones lógicas.
        boolean verdadero = true;
        System.out.println("mi verdadero es "+ verdadero);

        boolean falso = false;
        System.out.println("mi falso es "+ falso);
        
        //No es un tipo de dato primitivo, sino un objeto que almacena una secuencia de caracteres. Se usa para texto.
        String texto = "hola";
        System.out.println("mi texto es "+ texto);
    }
}