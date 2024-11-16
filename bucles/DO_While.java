package bucles;
class DO_While {
    public static void main(String[] args) {
        // Inicialización de la variable i en 0
        int i = 0;

        // Inicia el bucle do-while
        do { 
            // Imprime el valor de i y luego lo incrementa (i++).
            // El operador i++ realiza el post-incremento, por lo que primero se imprime el valor actual y luego se incrementa.
            System.out.println("Valor de i: " + i++);
        
        // La condición del while se evalúa después de ejecutar el bloque do.
        // El bucle continúa mientras i sea menor que 5.
            } while (i < 5);
    }
}
