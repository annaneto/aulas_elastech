package org.example.modulo2.encapsulamento;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    private boolean temSaldo(double valor){
        if(this.saldo >= valor){
            return true;
        }
        return false;
    }
    private void registrarLog(String acao){
        System.out.println("[LOG] " + acao);
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
            return;
        }
        this.saldo += valor;
        this.registrarLog(String.format("%s: deposito de: %.2f", this.titular, valor));
    }

    public void sacar(double valor){
        if(valor <=0 ){
            System.out.println("Valor inválido");
            return;
        }
        if(!this.temSaldo(valor)){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        this.registrarLog(String.format("%s: deposito de: %.2f", this.titular, valor));

    }


}
