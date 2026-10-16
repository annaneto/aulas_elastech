package org.example.modulo2.petshop;

public class Pet {
    public String nome;
    public String especie;
    public double peso;
    public String porte;

    public Pet(String nome, String especie, double peso){
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        //this.porte = this.verificarPorte(peso);
    }


    public void imprimirFicha(){

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + this.nome + "\nEspécie: " + this.especie + "\nPeso: " + this.peso + "\nporte: "
                + this.porte);
    }


    public void verificaPorte(double peso){
        if(peso < 10){
            this.porte = "Pequeno";
        }
        else if(peso >= 10 && peso < 25){
            this.porte = "Médio";
        }
        else{
            this.porte = "Grande";

        }
    }

    public String emitirSom() {
        return "Som do pet";
    }

}
