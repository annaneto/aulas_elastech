package org.example.modulo1.polimorfismo.pagamentos;

public class Pix implements MeiodePagamento{
    @Override
    public void pagar(double valor){
        System.out.printf("Você pagou %.2f no Pix\n", valor);
    }
}
