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
public class ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        System.out.println("Dias que o carro foi usado: ");
        double dias=entrada.nextDouble();
        System.out.println("Quantos Km foi ultilizado: ");
        double km=entrada.nextDouble();
        
        double precoDiario=45;
        double cortesia= dias*60;
        double kmUltrapassados= Math.max(0, km- cortesia);
        double custoKmEx=0.50;
        double custoKm =kmUltrapassados*custoKmEx;
        double total=precoDiario*dias+custoKmEx;
        
        System.out.println("Total a pagar: "+total);
        
        
        
    }
    
}
