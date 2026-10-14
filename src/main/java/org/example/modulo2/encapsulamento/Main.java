package org.example.modulo2.encapsulamento;

public class Main {
    static void main() {
        ContaBancaria c = new ContaBancaria();
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        c.setTitular("Flora");
        c.setSaldo(10000);
        System.out.println("Titular: " + c.getTitular() + "\nSaldo: "+ c.getSaldo());

        c1.setTitular("Anna");
        c1.setTitular("");
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Titular: " + c2.getTitular());
        c1.depositar(0);
        c1.depositar(-8);
        c1.depositar(100);
        c1.sacar(500);
        c1.sacar(-5);
        c1.sacar(50);
        System.out.println("Saldo: " + c1.getSaldo());
        //c1.registrarLog("Sacar 30 reais");


        // exercício 5
        Produto p = new Produto();
        System.out.println(p.nome);
        System.out.println(p.preco);
       //  System.out.println(p.codigoInterno);

        // 6
        System.out.println(c1.getNumeroConta());
        //c1.setNumeroConta("002-X");



    }
}
