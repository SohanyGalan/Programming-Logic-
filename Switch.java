class EstructuraSwitch {
    public static void main(String[] args) {
        
        char nota = '8';  // Definición de la variable de tipo char
        
        switch (nota) {
            case '5':
                System.out.println("Suficiente");
                break;
                
            case '6':
                System.out.println("Bien");
                break;
                
            case '7':
                System.out.println("Notable"); 
                break;
                
            case '8':
                System.out.println("Notables +");
                break;
                
            case '9':
                System.out.println("Sobresaliente");
                break;
                
            default:
                System.out.println("Suspendidos");
                // Si no se cumple ninguna de estas opciones, se ejecuta este bloque
        }
    }
}
