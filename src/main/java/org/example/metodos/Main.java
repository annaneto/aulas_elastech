package org.example.metodos;
import java.util.Scanner;

public class Main {

    static void main() {

        Scanner sc = new Scanner(System.in);
        //1

        Utilidades.boasVindas();

        //2

        Utilidades.saudar("Anna");

        //3

        double valor = Utilidades.dobro(3.5);
        System.out.println(valor);

        //4

        System.out.println("Digite a primeira nota");
        double valor1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a segunda nota");
        double valor2 = sc.nextDouble();
        sc.nextLine();
        double media = Utilidades.calcularMedia(valor1, valor2);
        System.out.println(media);

        //5

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        boolean ehmaior = Utilidades.ehMaiorDeIdade(idade);
        if(ehmaior){
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }

        //6

        int numero1 = 10;
        int numero2 = 8;
        int numero3 = 2;
        double numero4 = 4.8;
        double numero5 = 8.7;

        int resultado1 = Utilidades.somar(numero1, numero2);
        int resultado2 = Utilidades.somar(numero1, numero2, numero3);
        double resultado3 = Utilidades.somar(numero4, numero5);

        System.out.printf("Os resultados são %d, %d, %.2f\n", resultado1, resultado2, resultado3);


        //7
        Utilidades.saudacao();
        Utilidades.saudacao("Anna");

    }
}
