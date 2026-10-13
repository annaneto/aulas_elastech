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
        System.out.println("Digite o numero de telefone que você deseja consultar: ");
        Scanner sc = new Scanner(System.in);
        String telefone = sc.nextLine();
        if(listaTelefonica.containsKey(telefone)){
            System.out.println("Esse número está na lista, ele pertence à " + listaTelefonica.get(telefone));
        }









    }
}
