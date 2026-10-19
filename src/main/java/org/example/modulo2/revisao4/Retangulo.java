package org.example.modulo2.revisao4;

public class Retangulo extends Forma{
    public double largura;
    public double altura;

    @Override
    public double calcularArea(){
        return (this.largura * this.altura);
    }
}
