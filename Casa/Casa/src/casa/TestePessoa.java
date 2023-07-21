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
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        
       p1.setNome("Jose");
       p1.setIdade(20);
       p1.mostra();
       p1.fazAniversario();
    }
}
