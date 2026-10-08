package org.example.modulo1.hashset;
import java.util.*;

public class ExerciciosHashset {
    static void main() {
//        1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//        com o repetido.

        Set<String> nomes = new HashSet<>();
        nomes.add("Anna");
        nomes.add("Erick");
        nomes.add("Anna");
        nomes.add("Marilia");

        System.out.println(nomes.size());

//        2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//        de um if para avisar se a cor "verde" já está no conjunto ou não.
        Set<String> cores = new HashSet<>();
        ArrayList<String> coresLista = new ArrayList<>(List.of("rosa", "azul", "verde", "amarelo"));

        cores.addAll(coresLista);
        if(cores.contains("verde"))
        {
            System.out.println("A cor verde está no conjunto de cores");
        }else{
            System.out.println("A cor verde não está no conjunto de cores");
        }


//        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//        tirar os repetidos. Imprima os dois e compare.

        ArrayList<String> nome = new ArrayList<>(List.of("Lucia", "João", "Gabriela", "João", "Lucia", "Fernando"));
        Set<String> nomesHashSet = new HashSet<>(nome);
        System.out.println(nomesHashSet);

//        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//        imprima de novo, junto com o tamanho.

        Set<String> CPFs = new HashSet<>(List.of("198.686.717.08", "198.686.887.07", "187.656.117.06"));
        System.out.println(CPFs);
        CPFs.remove("198.686.717.08");
        System.out.println("Hashset: " + CPFs + "\nQuantidade de elementos: " + CPFs.size() );

//        5. Crie um HashSet com três frutas e percorra ele com for,
//        imprimindo uma por linha.

        Set<String> frutas = new HashSet<>(List.of("Banana", "Pera", "Uva"));

        for(String fruta : frutas){
            System.out.println(fruta);
        }

//        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//        imprima o isEmpty() de novo.

        Set<Integer> valores = new HashSet<>();
        System.out.println(valores.isEmpty());
        valores.add(10);
        System.out.println(valores.isEmpty());






    }
}
