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
public class HORASMINUTOSSEGUNDOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
            System.out.println("introduce horas");
            int horas= sc.nextByte();
            System.out.println("introduce minutos");
            int min= sc.nextInt();
            System.out.println("introduce segundos");
            int seg= sc.nextInt();
         if (seg>=60) {
             seg= seg+1;
             seg= - 60;
             min ++;
             if (min>=60){
                 min= min - 60;
                 horas++;
             }
             if (horas>=23){
                 horas= horas - 24;
             } 
            }
         System.out.println(horas+":"+min+":"+seg);
            

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
