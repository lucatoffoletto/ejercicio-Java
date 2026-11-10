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
public class DONACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*Scanner sc= new Scanner (System.in);
        int donacion=100;
                int ml=0;
                int cont=0;
                        
                        do{System.out.println("introduce la cantidad");
                        ml=sc.nextInt();
                        if(ml<1||ml>10){
                            System.out.println("fuera de rango");
                            cont--;
                            
                        }else{donacion-=ml;
                            System.out.println("quedan"+donacion);
                        }
                        cont++;
                        }while(donacion>0);
                        System.out.println("personas"+cont);*/
         
          Scanner sc= new Scanner (System.in);
          int bateria=25,rand=0,cont=0;
          boolean avion=false;
          
         do{
          cont++;
         rand=(int)(Math.random()*10+1);
         bateria=bateria-rand;
         if(cont==3&&bateria>0){
            avion=true;
         }
         }while(bateria>0&&!avion);
         if(avion){
             System.out.println("bateria es"+bateria+"modo avion"+avion);
         }else{
             System.out.println("bateria es"+bateria);
         }
         
    
    
          
          
          
          
          
          
      
          
                        
    }
    
}
