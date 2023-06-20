
package javabootcampatlc9;


import java.util.Scanner;


public class JavaBootcampATLC9 {

    
    public static void main(String[] args) {
        
        String[] personas = {"Jorge ew", "Lucas Moy", "Gaston Sanz"};
      
        
        
        
        System.out.println("Ingrese su busqueda: ");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();
       
        
   
        //For each
        
        for (String nombrePersona : personas) {
            if(nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){
                 System.out.println("La persona que buscas es: "+ 
                        nombrePersona);
            }
            
     
            
        }
    
    }
}
