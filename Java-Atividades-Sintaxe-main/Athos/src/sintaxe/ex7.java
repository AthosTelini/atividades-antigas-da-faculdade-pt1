/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        
        System.out.println("****ENTRE COM SUAS NOTAS PARA SABER A MEDIA: ex:##,## ****\n ");        
        System.out.println("\nPrimeira nota: ");
         double nota1=entrada.nextDouble();
         
        System.out.println("\nSegunda nota: ");
         double nota2=entrada.nextDouble();
         
         System.out.println("\nterceira nota: ");
         double nota3=entrada.nextDouble();
         
         System.out.println("\nquarta nota: ");
         double nota4=entrada.nextDouble();
         
         double media= (nota1+nota2+nota3+nota4)/4;
         //System.out.println("\nsua media é: "+media);
         System.out.printf("\nSua media é: %.2f \n", media  );
         
         if (media<3.49){
             System.out.println("REPROVADO");
         
         }
         else
             if (media>=3.5 && media <=6.49){
             System.out.println("RECUPERACAO");
         
         }
         else
             if (media<=6.5){
             System.out.println("APROVADO");
         
         }
    }
    
}
