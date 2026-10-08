package org.example.modulo1.revisao.atividade4;

public class Main {
    static void main() {

        Pet cachorro = new Pet();
        cachorro.nome = "Rex";
        cachorro.raca = "Golden Retriver";
        cachorro.peso = 80.5;

        System.out.println("Meu cachorro se chama " + cachorro.nome + " ele é um " + cachorro.raca + " e pesa: "
                + cachorro.peso + " quilos");

        Pet gato = new Pet();
        gato.nome = "Renata";
        gato.raca = "srd";
        gato.peso = 20;


        System.out.println("Minha gata se chama " + gato.nome + " ela é da raça" + gato.raca + " e pesa: "
                + gato.peso + " quilos");




    }
}
