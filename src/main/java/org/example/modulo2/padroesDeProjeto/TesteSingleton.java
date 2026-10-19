package org.example.modulo2.padroesDeProjeto;

public class TesteSingleton {
    private static TesteSingleton instancia;

    private TesteSingleton(){
    }

    public static TesteSingleton getIntancia(){
        if(instancia == null){
            instancia = new TesteSingleton();
        }
        return instancia;
    }

}

