package org.example.tratamentoExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciciosExcecoes {
    static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o dividendo: ");
            int dividendo = sc.nextInt();
            System.out.println("Digite o divisor: ");
            int divisor = sc.nextInt();

            //1

            try{
                int resultado = dividendo / divisor;
                System.out.println("O resultado da divisão é " + resultado);
            }catch(ArithmeticException ex){
                System.out.println("Não é possível fazer divisão por zero");
            }

            //2

            double[] notas = {8.5, 9.1, 7, 6.9, 9.8};
            System.out.println("Digite a posição da nota que deseja consultar");
            int posicao = sc.nextInt();
            try{
                System.out.println("A nota do aluno " + posicao + " é: " + notas[posicao]);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("A posição fornecida não existe.");
            }

            //3

            int idade;
            System.out.println("Digite sua idade: ");
            try {
                idade = sc.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Você não digitou um número inteiro, tente novamente: ");
                idade = sc.nextInt();
            }

            //4

            String nome = null;
            try{
                System.out.println(nome.length());
            }catch(NullPointerException ex){
                System.out.println("O nome não foi preenchido");
            }

            //5

            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            try{
                int resto = 100 % numero;
                System.out.println("O resto da divisão desse número por cem é: " + resto);
            }catch(ArithmeticException ex){
                System.out.println("Não é possível calcular o resto da divisão por zero.");
            }

            //6

            String[] nomes = {"Julia", "Fernanda", "Luisa"};
            try{
                System.out.println(nomes[5]);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Você tentou acessar uma posição inexistente.");
            }finally{
                System.out.println("O programa continua funcionando.");
            }





    }
}
