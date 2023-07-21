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
public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;
    
    
    
    //Cliente objCliente1 = new Cliente();

    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }
    public void visualizarViagem(){
         System.out.println("Cliente: "+this.nome);
         System.out.println("Motorista: "+this.c1.getNomeCaminhoneiro());
         System.out.println("Veiculo: "+this.carreta1.getModeloCarreta());
         System.out.println("destino: "+this.viagem1.getDestino());
         System.out.println("ValorKm: "+this.viagem1.getValorKm());
         System.out.println("Distancia: "+this.viagem1.getDistancia());
         System.out.println("Valor total: "+this.viagem1.getValorViagem());
     }
      
     
        
    

   
}
