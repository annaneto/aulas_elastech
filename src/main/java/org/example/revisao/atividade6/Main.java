package org.example.revisao.atividade6;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Digite o seu ano de nascimento: ");
        usuario.anoNascimento = sc.nextInt();
        usuario.nome = sc.nextLine();
        System.out.println("Digite o seu nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("O usuário " + usuario.nome + " nasceu em " + usuario.anoNascimento);

    }
}
