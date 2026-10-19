package org.example.modulo2.petshop;

public class Tosa implements Servico{

    @Override
    public void executar(String nome){
        System.out.println("Tosando " + nome);
    }
}
