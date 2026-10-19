package org.example.modulo2.revisao4;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return (this.getSalarioBase() * 1.2);
    }

}
