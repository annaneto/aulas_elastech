package org.example.modulo2.petshop;

public class Gato extends Pet{

    public Gato(String nome, double peso) {
        super(nome, "gato", peso);
    }


    @Override
    public String emitirSom(){
        return "Miau";
    }

}
