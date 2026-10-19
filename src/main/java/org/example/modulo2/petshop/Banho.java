package org.example.modulo2.petshop;

public class Banho implements Servico{

    @Override
    public void executar(String nome){
        System.out.println("Dando banho em " + nome);
    }
}
