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
public class ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        System.out.println("Digite um numero ");
        int n= entrada.nextInt();
        
        System.out.println("Digite uma letra: ");
        String letra =entrada.next();
        
        for (int i=0;i<=n;i++){
            System.out.printf("%d=%s \n",i, letra);
        }
        
        }
    
    
    
}
