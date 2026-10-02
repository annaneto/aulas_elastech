package org.example.metodos;

public class Utilidades {

    public static void boasVindas() {
        System.out.println("Bem vinda ao curso de Java");
    }


    public static void saudar(String nome) {
        System.out.printf("Olá, %s! Tudo bem?\n", nome);
    }

    public static double dobro(double numero) {
        return numero * 2;
    }

    public static double calcularMedia(double n1, double n2) {
        return ((n1 + n2) / 2);
    }

    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }
    public static int somar(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
    public static double somar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static void saudacao(){
        System.out.println("Olá!");
    }
    public static void saudacao(String nome){
        System.out.println("Olá " + nome + "!");
    }

}