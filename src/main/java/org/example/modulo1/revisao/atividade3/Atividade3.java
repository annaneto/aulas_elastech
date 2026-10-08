

package org.example.modulo1.revisao.atividade3;
import java.util.Scanner;
public class Atividade3 {

    static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a opção desejada: \n1 - Ver camisas \n2 - Ver calças\n3 - Sair \n");
            int opcao = 0;
            do{
                opcao = scanner.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Sua escolha foi a 1: ver camisas");
                        break;
                    case 2:
                        System.out.println("Sua escolha foi a 2: ver calças");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opção invalida.");
                }
            }while(opcao != 3);
    }
}
