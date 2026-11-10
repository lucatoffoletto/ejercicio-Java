/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema44;
import java.util.Scanner;
/**
 *
 * @author MEDAC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
           String nombre="hola que tal";
           nombre=nombre+ "estas";
           System.out.println(nombre);
           System.out.println(nombre.length());
           System.out.println(nombre.charAt(5));
           System.out.println(nombre.compareTo("hola que tal estas"));
           System.out.println(nombre.equals("hola que tal"));
           System.out.println(nombre.equalsIgnoreCase("HOLA QUE TAL ESTAS"));
           System.out.println(nombre.concat("que"));
           System.out.println(nombre.indexOf("q"));
           System.out.println(nombre.indexOf("a",5));
           System.out.println(nombre.isEmpty());
         System.out.println(nombre.replace("que","QUE "));
         System.out.println(nombre.substring(5,9));
         System.out.println(nombre.toLowerCase());
         System.out.println(nombre.toLowerCase());
         System.out.println(nombre.toCharArray());
         char [] array= nombre.toCharArray();
         System.out.println(nombre.trim());
         String num=String.valueOf(25);
         System.out.println(num);
         
         
         
         
         
          
           
    }
    
}
