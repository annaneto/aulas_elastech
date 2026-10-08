package org.example.modulo1.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosArraylist {
    static void main() {
        // Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Anna");
        listaNomes.add("Larissa");
        listaNomes.add("Gabriela");
        System.out.println(listaNomes);


        //Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList <String> frutas = new ArrayList<>(List.of("Banana", "Uva", "Melancia", "Morango"));
        System.out.println("O primeiro elemento é: " + frutas.getFirst() + ", o ultimo elemento é " + frutas.getLast()
                + ", e a quantidade de elementos é " + frutas.size());

        //Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList <String> nomes = new ArrayList<>(List.of("Bruna", "Laura", "Maria", "João"));
        System.out.println(nomes);
        nomes.set(1, "Renata");
        System.out.println(nomes);

        //Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram

        ArrayList <String> cidades = new ArrayList<>(List.of("Cabo Frio", "Rio de Janeiro", "Macaé", "Rio das Ostras"));
        cidades.remove(1);
        System.out.println("Sobraram " + cidades.size() + " cidades");

        //Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
        // (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList <String> outrosNomes = new ArrayList<>(List.of("Fernando", "Raissa", "Jessica", "Luis", "Julia"
                , "Eduarda"));
        for(int i = 0; i < outrosNomes.size(); i++){
            System.out.println(i + " : " + outrosNomes.get(i));
        }

        //Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        // Se não estiver, avise.
        Scanner sc = new Scanner(System.in);
        ArrayList <String> maisNomes = new ArrayList<>(List.of("Maria", "Julia", "Fernanda", "Gabriela", "Ana"));
        System.out.println("Digite o nome que deseja consultar: ");
        String nome = sc.nextLine();
        if(maisNomes.contains(nome)){
            System.out.println("Esse nome está presente na lista, ele está na posição " + maisNomes.indexOf(nome));
        }
        else{
            System.out.println("Esse nome não está presente na lista");
        }



    }
}
