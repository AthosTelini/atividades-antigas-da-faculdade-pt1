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
public class EX8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        /*é HP (altura da parede) e largura é LP
(largura da parede) precisa ser coberta por azulejos também regulares. O azulejo retangular
tem dimensões HA(altura do azulejo) e LA (largura do azulejo).*/
        System.out.println("Qual a altura da parede: ");
        double HP=entrada.nextDouble();
        System.out.println("Qual a largura da parede: ");
        double LP=entrada.nextDouble();
        System.out.println("Qual a altura do azulejo: ");
        double HA=entrada.nextDouble();
        System.out.println("Qual a largura do azulejo: ");
        double LA=entrada.nextDouble();
        
        //double parede=HP*LP;
        
        double calc1= HP/HA;
        double calc2= LP/LA;
          if (HP % HA != 0) {
            calc1++;
        }
          if (LP % LA != 0) {
            calc2++;
        }
          double res=calc1*calc2;
        System.out.println("Quantidade de azulejo :  "+res);
        
        
    }
}
