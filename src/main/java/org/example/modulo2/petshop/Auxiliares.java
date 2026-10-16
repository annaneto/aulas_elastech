package org.example.modulo2.petshop;

public class Auxiliares {

    static public void opcoes() {
        System.out.println("Digite sua opção: \n" +
                "Digite 1 para cadastrar um pet\n" +
                "Digite 2 para ver lista de pets cadastrados\n" +
                "Digite 3 para consultar um pet\n" +
                "Digite 4 para ver lista de especies cadastradas\n" +
                "Digite 5 para adicionar um pet na fila de banho\n" +
                "Digite 6 para atender o proximo pet da fila\n" +
                "Digite 7 para realizar serviços\n" +
                "Digite 8 para sair");
    }

    static public void imprimePet(Pet pet){
        System.out.println("Nome: " + pet.nome + "\nEspécie: " + pet.especie + "\nPeso: "
                + pet.peso + "\nPorte: " + pet.porte + "\n" + pet.nome + " faz: " + pet.emitirSom());
    }

    static public void imprimeLinha(){
        System.out.println("===========================");
    }

}
