package org.example.modulo1.estruturasDecisao;

//4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa
//ter 18 anos ou ter autorização. Faça o mesmo para
//precisa ter 18 anos e ter autorização

public class Exercicio4 {
    static void main() {
        int idade = 17;
        boolean temAutorizacao = true;

        // cenário 1 precisa ter autorização ou ter mais de 18 anos

        if(idade >= 18 || temAutorizacao){
            System.out.println("Você pode entrar na festa!");
        }
        else{
            System.out.println("Você não pode entrar na festa");
        }
        // cenário 2 precisa ter autorização e ter mais de 18 anos

        if(idade >= 18 && temAutorizacao){
            System.out.println("Você pode entrar na festa!");
        }
        else{
            System.out.println("Você não pode entrar na festa");
        }
    }
}
