/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema44;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*String [][] tablero={{"pez","elefante"},
               {"perro","gato"},{"elefante","pez"},
                {"gato","perro"} };
                mostrar(tablero);*/          
                
       String [] [] tablerojugar=new String [4][2];
       rellenar(tablerojugar);
       mostrar(tablerojugar);
    }

    private static void mostrar(String[][] tablero) {
     for (int i = 0 ; i< tablero.length; i++) {
         System.out.println(Arrays.toString(tablero[i]));
     }
     
    }

    private static void rellenar(String[][] tablerojugar) {
        for (int i = 0; i < tablerojugar.length; i++) {
            Arrays.fill(tablerojugar[i],"____");
        }
           
    }
    
    
    }
    
    

