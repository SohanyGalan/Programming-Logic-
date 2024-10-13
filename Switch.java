
class   EstructuraSwitch {
    public static void main(String[] args) {
        
        char nota = '8';
        
   switch (nota) {
       case '5':
       System.out.println ("Suficiente");
       break;
       
       case '6':
           System.out.println ("bien");
           break;
           
           case '7':
           System.out.println ("notable"); 
           break;
           
           case '8':
           System.out.println ("notables +");
           break; 
           
           case '9':
           System.out.println ("sobresaliente");
           break;
           
           default:
           System.out.println ("suspendidos"); 
 //si no se cumple ninguna de estas opciones me va a lanzar este defualt  

   }
        
    }
}
