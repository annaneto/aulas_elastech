package org.example.modulo1.revisao.desafio;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;


        while (opcao != 2) {
            System.out.println("Digite 1 para cadastrar aluna \nDigite 2 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Digite o nome da aluna: ");
                    aluna.nome = sc.nextLine();

                    System.out.println("Digite a primeira nota da aluna: ");
                    aluna.nota = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a segunda nota da aluna: ");
                    aluna.nota2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(aluna.nota + " e " + aluna.nota2);

                    aluna.media = (aluna.nota + aluna.nota2)/2;
                    if(aluna.media >= 6 ){
                        aluna.passou = true;
                    }
                    else{
                        aluna.passou = false;
                    }
                    System.out.println("O nome da aluna é " + aluna.nome + ", sua primeira nota foi " +
                            aluna.nota + ", sua segunda nota foi " + aluna.nota2 + " e sua media foi " +
                            aluna.media + " situação da aluna: " + (aluna.passou ? "Foi aprovada" : "Foi reprovado"));

                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }
    }
}