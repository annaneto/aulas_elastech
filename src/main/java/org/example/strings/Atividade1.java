package org.example.strings;
import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    static void main() {
        // questão 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seu nome tem " + nome.length() + " letras");

        // questao 2


        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu nome é " + nome.toUpperCase());

        // questao 3

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu nome começa com " + nome.charAt(0));

        //questao 4

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        if(frase.contains(palavra)){
            System.out.println("A palavra aparece na frase");
        }
        else{
         System.out.println("A palavra não aparece na frase");
        }

        // questao 5

        System.out.println("Digite o seu nome: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite novamente o seu nome: ");
        String nome2 = sc.nextLine();
        if(nome1.equalsIgnoreCase(nome2))
             System.out.println("Os nomes são iguais");
        else{
            System.out.println("Os nomes são diferentes");
        }
    }
}
