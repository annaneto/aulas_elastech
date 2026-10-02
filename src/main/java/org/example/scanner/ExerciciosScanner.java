package org.example.scanner;

import java.util.Scanner;

public class ExerciciosScanner {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Olá, " + nome + " você tem " + idade + " anos e vai fazer " + (idade + 1)
                + " anos próximo aniversário");


        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.printf("Os resultados são: Soma: %d, Subtração: %d, Multiplicação: %d, " +
                "Divisão: %d e Resto da divisão: %d\n",(numero1+numero2), (numero1-numero2), (numero1*numero2),
                (numero1/numero2), (numero1%numero2));

        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        if(nota>=7){
            System.out.println("Aprovada");
        }
        else if(nota < 7 && nota >= 5.9){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovada");
        }
        System.out.println("Digite o número para calcular a tabuada: ");
        int numeroTabuada =  sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numeroTabuada*i);
        }

    }
}
