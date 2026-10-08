package org.example.modulo1.arraydeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciciosArrayDeque {
    static void main() {
//       1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//       e quantas pessoas tem.

        ArrayDeque<String> pessoas = new ArrayDeque<>();
        pessoas.add("Juliana");
        pessoas.add("Fernanda");
        pessoas.add("Gabriela");
        System.out.println(pessoas);

//        2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//        imprima a fila logo depois. Repare que ela não mudou.

        ArrayDeque<String> fila = new ArrayDeque<>();
        ArrayList<String> filaAL = new ArrayList<>(List.of("João", "Felipe", "Luis"));
        fila.addAll(filaAL);
        System.out.println("O proximo da fila é " + fila.peek());
        System.out.println(fila);

//        3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//        depois. Compare com o exercício 2.

        System.out.println(fila.poll());
        System.out.println(fila);


//        4. Crie uma fila com três nomes e atenda todos usando
//        while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> filaPessoas = new ArrayDeque<>(List.of("Mariele", "Joana", "Fernanda", "Marilia"));
        while(!filaPessoas.isEmpty()){
            System.out.println(filaPessoas.poll());
        }
        System.out.println("Fila vazia!");

//        5. Crie uma fila com três nomes e use contains para responder duas
//        perguntas: se "Bia" está na fila e se "Zoe" está.

        filaPessoas.addAll(Arrays.asList("Anna", "Giovana", "Bia"));
        System.out.println("Bia está na fila? " + filaPessoas.contains("Bia")
                + "\nE tem Zoe na fila? " + filaPessoas.contains("Zoe"));

//        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//        - se estiver vazia  -> "Não tem ninguém na fila."
//                - se tiver gente    -> "Próximo: [nome]"
//        Depois adicione uma pessoa e teste de novo.

        ArrayDeque<String> filaNomes = new ArrayDeque<>();
        boolean estaVazia = filaNomes.isEmpty();
        if(estaVazia){
            System.out.println("A fila está vazia");
        }
        else{
            System.out.println("Não está vazia, o próximo será: " + filaNomes.peek());
        }
        filaNomes.add("Jessica");
        estaVazia = filaNomes.isEmpty();
        if(estaVazia){
            System.out.println("A fila está vazia");
        }
        else{
            System.out.println("Não está vazia, o próximo será: " + filaNomes.peek());
        }







    }
}
