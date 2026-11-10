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
public class SWITCH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("introduce numero");
    int num1= sc.nextInt();
        
       switch (num1) {
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
               System.out.println("suspenso");
               break;
           case 5:
               System.out.println("suficiente");
               break;
           case 6:
               System.out.println("bien");
               break;
           case 7,8:
               System.out.println("notable");
               break;
           case 9,10:
               System.out.println("sobresaliente");
               
                     
            
       }
        
        
    } 
}
