/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import java.time.LocalDate;

/**
 *
 * @author 1106060642
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private String dataEntrada;
    private String rg;
    private Boolean ativo;
    private double salario; 

public void bonifica(double aumento){
    this.salario = salario+aumento;
}    
public void mostra (){
    System.out.println("Nome:"+this.nome);
    System.out.println("Departamento:"+this.departamento);
    System.out.println("Data de Entrada:"+this.dataEntrada);
    System.out.println("Número RG:"+this.rg);
    System.out.println("Ativo:"+(this.ativo ? "sim" : "não"));
    System.out.println("Salário:"+this.salario);
   
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean isSituacao() {
        return ativo;
    }

    public void setSituacao(Boolean situacao) {
        this.ativo = situacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public String getDataEntrada(String dataEntrada){
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }
    
    }

