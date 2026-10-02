package org.example.arrays;

import java.util.Scanner;

public class Exercicios {
    static void main(){

        Scanner sc = new Scanner(System.in);

        //Atividade 1
        String[] alunas = {"Anna", "Maria", "Luisa", "Clara", "Julia"};
        System.out.println(alunas[0] + "\n" +  alunas[2] + "\n" + alunas[4]);

        //Atividade 2 & atividade 3

        double contador = 0;

        double notas[] = {8, 6, 10, 7, 9};
        for(int i = 1; i < notas.length; i++){
            System.out.println("Nota " + i + ": " + notas[i]);
            contador += notas[i];
        }
        double media = contador / notas.length;
        System.out.println("Soma das notas: " + contador + " media: " + media);

        // Atividade 4
        
        int numeros[] = new int[5];

        for(int i = 0; i < numeros.length ; i++){
            System.out.println("Digite o número: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 1; i <= numeros.length ; i++){
            System.out.println(numeros[numeros.length - i]);
        }
    }
}
