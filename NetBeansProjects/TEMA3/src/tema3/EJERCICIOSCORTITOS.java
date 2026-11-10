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
public class EJERCICIOSCORTITOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
       /* int num;
       Scanner sc= new Scanner (System.in);
        System.out.println("esribe el numero");
        num= sc.nextInt();
        while(num>=0) {
            System.out.println("introduce un numero");
        num=sc.nextInt();
        if(num%2==0){
            if(num!=0){
            System.out.println("es par");}
          
        }else{
            System.out.println("es impar");
        }
        }  
    
     System.out.println("escribe el numero");
            num= sc.nextInt();*/
       
      /*int num;
      int cont=0;
      Scanner sc= new Scanner (System.in);
        System.out.println("rdcribe el numero");
        num= sc.nextInt();
        while(num>=0) {
           if(num%2==0){
            if(num!=0){
            System.out.println("es par");}
          
        }else{
            System.out.println("es impar");
           } 
           
       System.out.println("introduce numero");
          num= sc.nextInt();        
    }

          cont++;
          System.out.println("contador es:"+cont)*/
     /* Scanner sc= new Scanner (System.in);
     char bolas;
     int contb=0;
     int contn=0;
     int votos=0;
     while(votos<10){
         System.out.println("introduce color de la bola");
         bolas=sc.next().charAt(0);
         if(bolas=='n'){
             contn++;
         }else if(bolas=='b'){
             contb++; 
                     }else{
             votos=votos-1;
         }
         votos++;
         
         }
     if(contb>contn){
             System.out.println("ganan las blancas");
         }
         else if(contb<contn){
             System.out.println("ganan las negras");
         }else{
             System.out.println("empate");
     }*/
     
    /*Scanner sc= new Scanner (System.in);
        System.out.println("introduce rango minimo");
        int rangominimo= sc.nextInt();
        System.out.println("introduce rango maximo");
        int rangomaximo=sc .nextInt();
        
          System.out.println("introduce num");
        int num=sc.nextInt();
        
        while (num<rangominimo||num>rangomaximo){
            
            
        
        
         System.out.println("introduce numero");
        num= sc.nextInt();
        }*/
    
   /*Scanner sc= new Scanner (System.in);
  int num=sc.nextInt();
   int rand= (int)(Math.random()*100);
        while(num!=rand){
            if(num>rand){
                System.out.println("es menor");
            }else
                System.out.println("es mayor");
            System.out.println("escribe num");
         num=sc.nextInt();*/
        /*Scanner sc= new Scanner (System.in);
        int edad;
        int contarmayor=0;
        int contarmenor=0;
        System.out.println("escribe edad");
        edad=sc.nextInt();
        while(edad!=-1) {
            if(edad>0 && edad>18){
                System.out.println("escribe edad");
                contarmayor++;
                edad=sc.nextInt(); 
            }else if(edad<18){
                System.out.println("escribe edad");
                contarmenor++;
                
            }*/
      
    /*Scanner sc= new Scanner (System.in);
         char letra;
    System.out.println("¿quieres salir? y o n");
    letra=sc.next().charAt(0);
    while(letra!='y'||letra!='Y');{
        if(letra!='n'){*/
            
    Scanner sc= new Scanner (System.in);
    int altura=0;
    int alturaMax=0;
    int etiqueta=1;
    int etiquetaMax=0;
        System.out.println("cual es la altura");
            altura=sc.nextInt();
        while(altura!=-1){
            if(altura>alturaMax){
                alturaMax=altura;
                etiquetaMax=etiqueta; 
            };
            etiqueta++; 
            System.out.println("cual es la altura");
        altura=sc.nextInt();
           
        }System.out.println("la altura maxima es"+alturaMax+"y la etiqueta es"+etiquetaMax);
    }
    
  
    
    
    
    
    
    
    

   
    
    
  
        
    }
                
  

        
     
      
    
  

