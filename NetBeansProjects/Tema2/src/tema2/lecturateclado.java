/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class lecturateclado {
    

     //Scanner=tipo variable sc=nombre variable
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
     Scanner sc= new Scanner (System.in);
        System.out.println("introduce el valor en F");
        double f=sc.nextDouble();
       final double valor=32;
       double c=0.0;
       c=(f-valor)*5/9;
   
       System.out.println("el valor f de" + f +"es en c :"+c );
        
        
               
     
     
     
     
     
     
    }
    
}
