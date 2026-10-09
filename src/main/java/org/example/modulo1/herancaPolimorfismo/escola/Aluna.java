package org.example.modulo1.herancaPolimorfismo.escola;

public class Aluna extends Pessoa{
    String curso;

    public void estudar(){
        System.out.println(this.nome + " está estudando " + this.curso);
    }
}
