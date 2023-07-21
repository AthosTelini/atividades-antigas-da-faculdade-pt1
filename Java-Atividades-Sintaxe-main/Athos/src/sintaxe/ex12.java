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
public class ex12 {

    private static char s;
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        /*
        
             Caso o contribuinte ganhe até 10800.00 reais, ele está isento do pagamento
             Caso o contribuinte ganhe entre 10800.00 até 21600.00 reais, ele deve calcular o seu
    IRPF Simples multiplicando sua renda por 0.15 (alíquota de 15%) e subtraindo da
    multiplicação 1620.00 reais.
             Quando o contribuinte ganhar a partir de 21600.01 reais, ele deve calcular seu IRPF
    Simples multiplicando sua renda por 0.275 (alíquota de 27.5%) e subtrair da
    multiplicação 4320.00 reais.
            */
        double valor=0;
        char escolha;
        
            
        do {
        System.out.println("Qual é sua renda?: ");
        double renda=entrada.nextDouble();
        
        if (renda < 10800.00){
            System.out.println("Você  insento de pagar!");
        
        }
        else if (renda >= 10800.00 && renda <21600.00 ){
                valor =((renda*0.15)-1620.00);
                System.out.printf("Valor a ser pago: R$ %.2f \n",valor);
        }
            else if (renda >=21600.01){
                valor= ((renda*0.275)-4320.00);
                System.out.printf("Valor a ser pago: R$ %.2f \n",valor);
            }
            System.out.println("Consultar novamente? (s/n) ");
            escolha = entrada.next().charAt(0);
        } while (escolha == 's' );
    }
    
}
