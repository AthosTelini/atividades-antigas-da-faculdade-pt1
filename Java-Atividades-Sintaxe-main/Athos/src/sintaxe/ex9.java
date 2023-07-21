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
public class ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        System.out.println(" Quantos metros tem o terreno? alturaxlargura \n");
        System.out.println(" Altura do terreno: ");
        double at=entrada.nextDouble();
        System.out.println(" Largura do terreno : ");
        double lt=entrada.nextDouble();
        
        System.out.println(" Quantos metros tem a construcao do terreno? alturaxlargura \n");
        System.out.println(" Altura da construcao: ");
        double ac=entrada.nextDouble();
        System.out.println(" Largura da construcao: ");
        double lc=entrada.nextDouble();
        
        double areaConst=ac*lc;
        double areaTerreno= at*lt;
        
        double sobra= areaTerreno-areaConst;
        
         double metrosConst= areaConst*5;
         double metrosNConst= sobra*3.80;
         double total=metrosConst+metrosNConst;
         //System.out.println("Valor a ser pago: "+total);                                                                                                         
         System.out.printf("Valor a ser pago: %.2f",total);
        
    }
}
