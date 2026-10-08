package org.example.modulo1.estruturasDecisao;


//1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17
//é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

public class Exercicio1 {

    static void main() {

        int idade = 24;

        if(idade < 13){
            System.out.println("Criança");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }
    }
}