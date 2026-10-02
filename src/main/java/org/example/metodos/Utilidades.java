package org.example.metodos;

public class Utilidades {

    public static void boasVindas(){
        System.out.println("Bem vinda ao curso de Java");
    }


    public static void saudacao(String nome) {
        System.out.printf("Olá, %s! Tudo bem?\n", nome);
    }

    public static double dobro(double numero){
        return numero * 2;
    }

    public static double calcularMedia(double n1, double n2){
        return (n1 * n2) / 2;
    }

}