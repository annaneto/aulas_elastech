package org.example.modulo1.polimorfismo.pessoas;

public class Professora extends Pessoa {

    public String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.println(this.nome + " lançou a nota " + nota + " para a aluna " + aluna);
    }

    @Override
    public void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}