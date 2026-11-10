/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class MASEJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Scanner sc= new Scanner (System.in);
    char carnet;
     System.out.println("que edad tienes?");
     int edad=sc.nextInt();
     if(edad>18){
         System.out.println("pasa adentro guapeton");
         System.out.println("tiene carnet");
           carnet=sc.next().charAt(0);
     if(carnet=='y'){
         System.out.println("pa dentro mi chulo");
     }else if(carnet=='n'){
         System.out.println("los traidores no pasan");
     }else{
         System.out.println("letra introducida incorrecta");
     }
         
        
     }else{
         System.out.println("no tienes edad");
     }
   
             
     
     
        
     
        
    }
   
    
}
