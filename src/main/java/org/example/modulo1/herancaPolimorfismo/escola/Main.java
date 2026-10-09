package org.example.modulo1.herancaPolimorfismo.escola;

public class Main {
    static void main() {
        //1
        Aluna aluna = new Aluna();
        aluna.nome = "Anna";
        aluna.idade = 24;
        aluna.apresentar();
        //2
        aluna.curso = "ciência da computação";
        aluna.estudar();

        //3
        Professora prof = new Professora();
        prof.disciplina = "Java Back-End";
        prof.idade = 30;
        prof.nome = "flora";
        prof.lancarNota(aluna.nome, 9.6);
        prof.apresentar();



    }
}
