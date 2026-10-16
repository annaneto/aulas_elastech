package org.example.modulo2.petshop;

public class Cachorro extends Pet{

    public Cachorro(String nome, double peso) {
        super(nome, "cachorro", peso);
    }


    @Override
    public String emitirSom(){
        return "Au au ";
    }

}
