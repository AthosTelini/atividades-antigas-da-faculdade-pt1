/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        
         
        System.out.println("Voce é homem ou mulher? \n");
        System.out.println("(h)- Homem;(m)-Mulher  ");
        String genero = entrada.next();
        
        
        System.out.println("\nQual sua altura? ");
        double altura=entrada.nextDouble();
        System.out.println("\nQual seu peso? ");
        double peso=entrada.nextDouble();
        
        
        //pegando dados da pessoa
        
        
        double imc=peso/(altura*altura);
        
        //calculando imc
    
        if(genero.contains("h") && imc <20.7  ){
            System.out.printf("\nSeu imc é: %.2f Voce esta abaixo peso ideal \n", imc  );   
        }
        
            if(genero.contains("h") && imc >=20.7 && imc <=26.4 ){
                System.out.printf("\nSeu imc é: %.2f Voce esta no peso ideal \n", imc  );
        }
             else
                if(genero .contains("h") &&  imc >26.5){
                    System.out.printf("\nSeu imc é: %.2f Voce esta OBESO \n", imc  );
        }
             
             
        
            if(genero.contains("m") && imc <19.0  ){
            System.out.printf("\nSeu imc é: %.2f Voce esta abaixo do peso ideal \n", imc  );  
        }
        
            if(genero.contains("m")&& imc >=19.1 && imc <=25.8 ){
                System.out.printf("\nSeu imc é: %.2f Voce esta no peso ideal \n", imc  );
        }
            else 
                 if(genero.contains("m") &&  imc >25.9 ){
                    System.out.printf("\nSeu imc é: %.2f Voce esta OBESA \n", imc  );
                    
        }
    }
    
}
