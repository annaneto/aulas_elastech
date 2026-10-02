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
        Utilidades.calcularMedia(valor1, valor2);




    }
}
