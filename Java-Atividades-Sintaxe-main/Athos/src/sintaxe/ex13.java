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
public class ex13 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
       
        
        double total=0;
        System.out.println("Numero de pessoas: ");
         int np= entrada.nextInt();
        System.out.println("Dias de  hospedagem: ");
         int dias= entrada.nextInt();
       
       if(np>0 && np<5){
       total=((np*160)*dias);
       }
       else if(np<=5 && np>=8){
       total=((np*120)*dias);
       }
       else if(np>8){
       total=((np*80)*dias);
       }
        System.out.println("Total: R$"+total);
       
    }   
}
