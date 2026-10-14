package org.example.modulo1.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExerciciosHashMap {
    static void main() {

        //1

        HashMap<String, Integer> nomeIdade = new HashMap<>();
        nomeIdade.put("Anna", 24);
        nomeIdade.put("Luisa", 16);
        nomeIdade.put("Sophia", 6);
        System.out.println("Idade da Anna: " + nomeIdade.get("Anna"));

        //2

        HashMap<String, Double> produto = new HashMap<>();
        produto.put("Carne moída", 29.50);
        produto.put("Leite condensado", 5.80);
        produto.put("Café", 5.00);
        System.out.println(produto);
        produto.put("Café", 7.50);
        System.out.println(produto);

        //3

        HashMap<String, String> listaTelefonica = new HashMap<>();
        listaTelefonica.put("Anna", "97087-3003");
        listaTelefonica.put("Julia", "98887-3863");
        System.out.println("Digite o nome da pessoa que você deseja consultar o número: ");
        Scanner sc = new Scanner(System.in);
        String pessoa = sc.nextLine();
        if(listaTelefonica.containsKey(pessoa)){
            System.out.println(pessoa + " está na lista, seu número de telefone é " + listaTelefonica.get(pessoa));
        }
        else{
            System.out.println(pessoa + " não está na lista");
        }

        //4
        HashMap<String, Integer> produtos = new HashMap<>();
        produtos.put("Camiseta", 5);
        produtos.put("Vestido", 10);
        System.out.println(produtos.getOrDefault("Vestido", 0));
        System.out.println(produtos.getOrDefault("Calça Jeans", 0));
        System.out.println(produtos.get("Calça Jeans"));

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Sofia", 10.8);
        notas.put("Mauricio", 8.0);
        notas.put("Joana", 7.8);
        System.out.println(notas + " | esse mapa tem tamanho: " + notas.size());
        notas.remove("Mauricio");
        System.out.println(notas + " | esse mapa tem tamanho: " + notas.size());










    }
}
