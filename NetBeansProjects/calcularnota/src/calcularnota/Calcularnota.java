    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularnota;

/**
 *
 * @author MEDAC
 */
public class Calcularnota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("calculando nota media, notas 7,8 y 8 ");
        int nota1=7;
        int nota2=8;
        int nota3=8;
        double media=calcularMedia(nota1,nota2,nota3);
        System.out.println("la media es:"+media);
        
        
    }
    public static double calcularMedia(int n1,int n2,int n3){
        double resultado=(n1+n2+n3)/3;
        return resultado;
    }
}
