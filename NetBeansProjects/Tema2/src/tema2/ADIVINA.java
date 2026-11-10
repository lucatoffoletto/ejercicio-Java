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
public class ADIVINA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc= new Scanner (System.in);
  int numR= (int)(Math.random()*100);
          int numU;
          System.out.println("escribe num");
          numU=sc.nextInt();
          System.out.println("mayor:"+(numU>numR));
          System.out.println("menor:"+(numU<numR));
          System.out.println("igual:"+(numU==numR));
         
  
          
    
        
        
        
        
        
        
        
    }
    
}
