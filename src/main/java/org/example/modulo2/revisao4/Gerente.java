package org.example.modulo2.revisao4;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return (this.getSalarioBase() * 1.5);
    }
}
