package org.example.modulo1.forEach;

import java.util.ArrayList;
import java.util.List;

public class AtividadesForEach {

    static void main() {

        //1
        String[] nomes = {"Luisa", "Sofia", "Jessica", "Beatriz"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //2
        ArrayList<Double> notas = new ArrayList<>(List.of(10.5, 7.8, 6.0, 9.2));
        for(double nota : notas){
            System.out.printf("A nota é %s\n", nota);
        }

        //3
        double acumuladorNotas = 0;
        for(double nota : notas){
            acumuladorNotas += nota;
        }
        System.out.printf("A soma de todas as notas é %.2f, e a média das notas é %.2f\n", acumuladorNotas
                , acumuladorNotas/notas.size());

        //4
        int quantidadeNomes = 0;
        for(String nome : nomes){
            if(nome.length() > 5){
                quantidadeNomes++;
            }
        }
        System.out.println("Quantidade de nomes com mais que 5 letras: " + quantidadeNomes);

        // 5
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }



    }
}