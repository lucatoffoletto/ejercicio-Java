/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author MEDAC
 */
public class EjercicioWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont=1;
       int dado= (int) ((Math.random()*20+1));
       while (dado!=5){
           cont ++;
           System.out.println("el dado es:"+dado);
           dado= (int) ((Math.random()*20+1));
       }
        System.out.println("Es cinco polla y ha tardado:"+cont);
        
        
        
        
        
        
        
        
        
        
    }
    
}
