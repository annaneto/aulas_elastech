package org.example.operadoresRelacionais;

//    1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes,
//    a primeira é maior, a primeira é menor para quando:
//            - a = 10, b = 3
//            - a = 3, b = 10
//            - a = 5, b = 5


public class Exercicio1 {

    static void main() {

        double notaAluna1 = 10;
        double notaAluna2 = 3;

        if(notaAluna1 > notaAluna2){
            System.out.println("São diferentes, a primeira nota é maior");
        }
        else if(notaAluna1 < notaAluna2){
            System.out.println("São diferentes, a segunda nota é maior");
        }
        else
            System.out.println("As notas são iguais");


    }





}

