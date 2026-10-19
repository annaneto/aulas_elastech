package org.example.modulo2.revisao4;

abstract public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase >= 0){
            this.salarioBase = salarioBase;
        }else{
            System.out.println("Valor inválido");
        }
    }

    abstract public double calcularSalario();





}
