package org.example.modulo2.revisao4;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(Double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }

    public double getPreco(){
        return this.preco;
    }

    public void setQuantidade(int quantidade){
        if (quantidade < 0){
            System.out.println("Quantidade inválidade");
        }else{
            this.quantidade = quantidade;
        }
    }
    public double getQuantidade(){
        return this.quantidade;
    }


}
