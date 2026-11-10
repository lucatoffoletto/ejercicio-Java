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
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc= new Scanner (System.in);
        
       //declaracion de varibles
        System.out.println("introduce numero 1");
       double num1=0.0, num2=0.0;
   
        num1 = sc.nextDouble();
        System.out.println("introduce el numero 2 ");
        num2 = sc.nextDouble(); 
        //operaciones
            System.out.println("suma:"+ (num1+num2));
            System.out.println("resta:"+(num1-num2));
            System.out.println("multiplicacion:"+ (num1*num2));
            System.out.println("division:"+(num1/num2));
            
        
        
        
        
        
     
        
        
        
        
    }
    
}
