package org.example.modulo1.revisao.atividade5;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            Produto produto =  new Produto();
            System.out.println("Digite o nome do produto");
            produto.nome = scanner.nextLine();
            System.out.println("Digite o preço do produto");
            produto.preco = scanner.nextDouble();
            scanner.nextLine();
            if(produto.preco > 100) {
                System.out.printf("O produto %s está muito caro! Ele está saindo à %.2f reais %n", produto.nome, produto.preco);
            }else{
                System.out.printf("O produto %s está com preço acessível! Ele está saindo à %.2f reais %n", produto.nome, produto.preco);
                }


        }

    }
}
