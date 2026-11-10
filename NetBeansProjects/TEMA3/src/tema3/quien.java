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
public class quien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables, gafas=false,sombrero=false,bigote=false
        boolean gafas=false, sombrero=false, bigote=false, barba=false, pelo=false;
        Scanner sc= new Scanner (System.in);
        System.out.println("tiene gafas?");
        gafas=sc.nextBoolean();
        System.out.println("tiene sombrero?");
        sombrero=sc.nextBoolean();
        System.out.println("tiene bigote?");
        bigote=sc.nextBoolean();
        System.out.println("tiene barba?");
        barba=sc.nextBoolean();
        System.out.println("tiene pelo?");
        pelo=sc.nextBoolean();
        if(bigote && sombrero && pelo && !gafas && !barba){
            System.out.println("es pops");
        }else if(!bigote && !sombrero && pelo && !gafas && barba){
            System.out.println("es victor");
        }else if (bigote && !sombrero && !pelo && !gafas && !barba){
            System.out.println("es salva");
        } else if (!bigote && !barba && !pelo && gafas && sombrero){
            System.out.println("es juan");
        }else if(bigote && barba && pelo && gafas && sombrero){
            System.out.println("es eggs");
        }else System.out.println("no es ninguno ");
           
                
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
