/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporto;

/**
 *
 * @author 15350106651
 */
public class Teste {
    public static void main(String[] args) {
        
        Carreta carreta1=new Carreta("Scania 113");
        Caminhoneiro caminhoneiro1 = new Caminhoneiro ("Joao", "cnpj", "cpf", 0);
        Viagem viagem1= new Viagem("Bahia",4 , 350);
         
        Cliente cliente1=new Cliente("Athos", caminhoneiro1, viagem1, carreta1);
        viagem1.calcularViagem();
        cliente1.visualizarViagem();
    }
    
}
