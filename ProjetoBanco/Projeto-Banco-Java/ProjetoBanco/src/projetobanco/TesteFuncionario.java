/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author Ras-E
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Otavio");
        funcionario.setDepartamento("TI");
        funcionario.setSalario(3000.0);
        funcionario.setDataEntrada("05/05/2022");
        funcionario.setRg("MG88.345.988");
        funcionario.setSituacao(Boolean.TRUE);
        funcionario.mostra();
        funcionario.bonifica(200.0);
        funcionario.mostra();
        
        Funcionario funcionario2 = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setDepartamento("RG");
        funcionario.setSalario(2000.0);
        funcionario.setDataEntrada("01/12/2022");
        funcionario.setRg("MG19.225.986");
        funcionario.setSituacao(Boolean.FALSE);
        funcionario.mostra();
        funcionario.bonifica(50.0);
        funcionario.mostra();
        
    }
}
