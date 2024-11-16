package Operadores;
class Operadoreslogicos{
    public static void main(String[] args) {
        
        boolean v = true;
        boolean f = false; 
        
        System.out.println("v && f = " + (v&&f));
        System.out.println("v || f = " + (v||f));
        System.out.println(" !(v && f ) = " + ! (v && f));
        
//&& (AND lógico): Ambas condiciones deben ser verdaderas.
//|| (OR lógico): Al menos una condición debe ser verdadera.
//! (NOT lógico): Invierte el valor booleano.
//^ (XOR lógico): Verdadero si una de las dos es verdadera, pero no ambas.
    }
}
