package org.example.modulo1.polimorfismo.pagamentos;

public class Boleto implements MeiodePagamento{
    @Override
    public void pagar(double valor){
        System.out.printf("Vocẽ pagou %.2f no boleto\n", valor);
    }
}
