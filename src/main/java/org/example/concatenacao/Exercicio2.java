package org.example.concatenacao;

public class Exercicio2 {

    static void main() {


        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" + preco + " cada. "
                + "Total R$" + (quantidade * preco));

    }
}