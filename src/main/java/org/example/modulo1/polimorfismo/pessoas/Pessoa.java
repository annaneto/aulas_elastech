package org.example.modulo1.polimorfismo.pessoas;

public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("Olá meu nome é " + this.nome + " e tenho " + this.idade + " anos");
    }
}
