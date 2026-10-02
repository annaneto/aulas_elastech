package org.example.estruturasDecisao;

//Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais,
// "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela.
// Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

public class Desafio {

    static void main() {


        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua nota é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada!");
        }
        else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovada");
        }



    }
}
