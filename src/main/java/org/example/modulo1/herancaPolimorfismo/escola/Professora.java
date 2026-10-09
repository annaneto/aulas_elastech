package org.example.modulo1.herancaPolimorfismo.escola;

public class Professora extends Pessoa{

    String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou a nota %.1f para a %s\n", this.nome ,nota, aluna);
    }
    @Override
    public void apresentar(){
        System.out.println("Meu nome é " + this.nome + " e eu ensino " + this.disciplina);
    }



}
