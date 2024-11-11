package condicionales;
class EvaluacionEstudiante {
    public static void main(String[] args) {
        // Declaración de la variable 'calificacion'
        int calificacion = 85;

        // Condicional if-else para evaluar el rendimiento
        if (calificacion >= 90) {
            System.out.println("Tu rendimiento es: Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Tu rendimiento es: Muy bueno");
        } else if (calificacion >= 70) {
            System.out.println("Tu rendimiento es: Bueno");
        } else if (calificacion >= 60) {
            System.out.println("Tu rendimiento es: Regular");
        } else {
            System.out.println("Tu rendimiento es: Insuficiente");
        }
    }
}
