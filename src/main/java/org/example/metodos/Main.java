package org.example.metodos;
import java.util.Scanner;

public class Main {

    static void main() {

        Scanner sc = new Scanner(System.in);

        Utilidades.boasVindas();

        Utilidades.saudacao("Anna");

        // 3 — Crie um método dobro(int numero) que devolve o dobro do número recebido.
        //  No main, chame ele e mostre o resultado.

        double valor = Utilidades.dobro(3.5);
        System.out.println(valor);

        // 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main,
        // peça as duas notas com Scanner e mostre a média com duas casas decimais.

        System.out.println("Digite a primeira nota");
        double valor1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a segunda nota");
        double valor2 = sc.nextDouble();
        sc.nextLine();
        double media = Utilidades.calcularMedia(valor1, valor2);
        System.out.println(media);

        //5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno
        // do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        boolean ehmaior = Utilidades.ehMaiorDeIdade(idade);
        if(ehmaior){
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }

//        6 — Crie três métodos com o mesmo nome somar:
//
//        um que recebe dois inteiros
//        um que recebe três inteiros
//        um que recebe dois decimais
//
//        No main, chame os três e veja o Java escolher sozinho qual usar.

        int numero1 = 10;
        int numero2 = 8;
        int numero3 = 2;
        double numero4 = 4.8;
        double numero5 = 8.7;

        int resultado1 = Utilidades.somar(numero1, numero2);
        int resultado2 = Utilidades.somar(numero1, numero2, numero3);
        double resultado3 = Utilidades.somar(numero4, numero5);

        System.out.printf("Os resultados são %d, %d, %.2f", resultado1, resultado2, resultado3);




    }
}
