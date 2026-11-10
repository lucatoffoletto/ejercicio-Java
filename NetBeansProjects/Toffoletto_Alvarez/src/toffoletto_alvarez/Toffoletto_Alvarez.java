/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toffoletto_alvarez;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Toffoletto_Alvarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*ejercico1
        Scanner sc= new Scanner (System.in);
       int cont;
        double temp,tempfin;
        System.out.println("introduce temperatura");    
        temp=sc.nextDouble();
        tempfin=-50.0;
        while(temp>tempfin){   
    System.out.println("introduce temperatura");
    temp=sc.nextDouble();
        }if(temp<tempfin)
          {System.out.println("fin de lectura");}*/

        Scanner sc= new Scanner (System.in);
        int edad;
    int numr=(int)(Math.random()*66);
        System.out.println("introduce edad"); 
        edad=sc.nextInt();
        while(edad!=-1){
         System.out.println("introduce edad");
            edad=sc.nextInt();
        }if(edad<18)
        {System.out.println("la entrada cuesta 6 euros");
           edad=sc.nextInt();
        }else if(edad>65){
                
            System.out.println("es jubilado y la entrada cuesta 4 euros");
        }


        
      

                        
    
}
}
