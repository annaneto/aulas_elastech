package org.example.modulo1.estruturasDecisao;

//2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente,
// mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

public class Exercicio2{

    static void main(){

        double saldoConta = 500;
        double valorCompra = 320;

        if(saldoConta >= valorCompra) {
            System.out.println("Compra aprovada! Saldo restante: R$" + (saldoConta - valorCompra));
        }
        else{
            System.out.println("Saldo insuficiente, faltam R$" + (valorCompra - saldoConta)
                    + " para completar a compra");
        }
    }
}