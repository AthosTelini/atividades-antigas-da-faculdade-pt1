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
public class Caminhoneiro {
    //“nome”, “cnpj”, “CPF” e “salario&quot; (todos
//os atributos deveram conter o modificador de acesso private).
    private String nomeCaminhoneiro;
    private String cnpj;
    private String cpf;
    private float salario;

    public String getNomeCaminhoneiro() {
        return nomeCaminhoneiro;
    }

    public void setNomeCaminhoneiro(String nomeCaminhoneiro) {
        this.nomeCaminhoneiro = nomeCaminhoneiro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
    public Caminhoneiro(String nomeCaminhoneiro, String cnpj, String cpf, float salario) {
        this.nomeCaminhoneiro = nomeCaminhoneiro;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    
    
}
