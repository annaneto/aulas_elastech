package org.example.revisao.atividade1;
import java.util.Scanner;


//1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida,
//verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando
//concatenação e printf para formatar o preço com duas casas decimais.
//Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"



public class Atividade1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do lanche: ");
        String nomeLanche = scanner.nextLine();
        System.out.println("Digite o valor do lanche: ");
        double valorLanche = scanner.nextDouble();

        if (valorLanche >= 30) {
            valorLanche -= 5;
            System.out.printf("O lanche %s custa R$%.2f", nomeLanche, valorLanche);
        } else {
            System.out.printf("O lanche %s custa R$%.2f", nomeLanche, valorLanche);
        }
    }
}