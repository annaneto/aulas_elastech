package org.example.modulo2.revisao4;

public class Main {
    static void main() {
        // abstração: simplificar o uso e mostrar


        //Questão 3

        Produto produto = new Produto();
        produto.setNome("Torta de Morango");
        produto.setPreco(15.0);
        produto.setQuantidade(5);

        System.out.println("Nome do item: " + produto.nome + " | Preço do produto: " + produto.preco
                + " | Quantidade de itens: " + produto.quantidade);

        // questão 5

        Retangulo retangulo = new Retangulo();
        // Forma retangulo = new Forma(); erro pois não podemos instânciar uma classe abstrata
        retangulo.nome = "Retangulo";
        retangulo.largura = 8.5;
        retangulo.altura = 3.0;
        System.out.println(retangulo.exibirNome());
        System.out.println("A área do retângulo é: "  + retangulo.calcularArea());

        // questão 6

        Gerente gerente = new Gerente("Roberto", 20000);
        Desenvolvedor dev = new Desenvolvedor("Julia", 5000);
        NotificadorEmail email = new NotificadorEmail();
        FolhaPagamento pag = new FolhaPagamento(email);
        pag.pagar(gerente);
        pag.pagar(dev);








    }
}
