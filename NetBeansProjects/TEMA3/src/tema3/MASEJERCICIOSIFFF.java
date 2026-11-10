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
public class MASEJERCICIOSIFFF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc= new Scanner (System.in);
       int resta=0;
       int resultado=0;
       int horas=0;
        System.out.println("cuantas horas has estado en el taller?");
        horas=sc.nextInt();
        if(horas>0){
         //el resultado es valido//
         if(horas<6){
             resultado=10+horas+10;
             System.out.println(("resultado:")+resultado);
         }else if(horas>6){
             resta=horas-5;
             resultado=5*10+resta*15+10;
             System.out.println("resultado"+resultado);
         }else {  
                 System.out.println("horas invalidas");                       
    } 
    }
    }}