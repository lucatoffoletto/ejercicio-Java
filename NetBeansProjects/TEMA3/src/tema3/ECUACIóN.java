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
public class ECUACIóN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
      
       double x1,x2,d;
       
      
        System.out.println("introduce valor a ");
          int a=sc.nextInt();
        
            System.out.println("introduce valor b "); 
          int b=sc.nextInt();
       System.out.println("introduce valor c ");
        int c=sc.nextInt();
      
     d=b*b-4*a*c;
        if(a==0){
            System.out.println("no existe soluciones");
        }
        else{
            if(d<0){
                System.out.println("no se puede");
            
        }else{
                x1=(-b+Math.sqrt(d))/(2*a);
                x2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("x1:"+x1+"x2:"+x2);
                
                
                
                
                
                
                
                
            }
    
        }
              
        
        
        
        
        
        
    }
    
}
