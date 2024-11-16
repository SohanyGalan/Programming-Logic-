package bucles;

class EstructuraSwitch {
    public static void main(String[] args) {
        
        int nota = 8;
        
        switch (nota) {
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notables +");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Suspendidos");
        }
    }
}
