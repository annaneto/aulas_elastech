package org.example.modulo1.interfaces.meiosTransporte;

public class Moto implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("A moto está ligado");
    }

    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }
}
