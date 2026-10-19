package org.example.modulo2.revisao4;

public class FolhaPagamento{

    public Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        notificador.notificar();
        System.out.printf("você recebeu: %.2f\n", f.calcularSalario());
    }



}
