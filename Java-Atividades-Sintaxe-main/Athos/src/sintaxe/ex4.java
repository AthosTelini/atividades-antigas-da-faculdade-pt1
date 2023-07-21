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
public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        float dollar=(float) 5.10;
        System.out.println("Digite o valor em reais: \n");
        float reais=entrada.nextFloat();
        float res = reais*dollar;
        
        System.out.println("Valor convertido= "+res+" Dollar");
        
        
        
        
        
    }
    
}
