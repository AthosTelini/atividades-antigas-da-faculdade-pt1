/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 15350106651
 */
public class Pessoa {
    String nome;

    int idade;
    
     public void mostra (){
         System.out.println("Nome:"+this.nome);
         
         System.out.println("Idade: "+this.idade);
   
}
    

    void fazAniversario(){
      this.idade++;
      System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.idade + " anos.");
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
