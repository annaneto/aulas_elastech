package org.example.modulo2.petshop;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {


    static void main() {


//        String nome = "Mel";
//        String especie = "Cachorro";
//        double peso = 8.5;
//        System.out.println("=== FICHA DO PET ===");
//        System.out.println("Nome: " + nome + "\nEspécie: " + especie + "\nPeso: " + peso);


//        String porte;

//        if(peso < 10){
//            porte = "Pequeno";
//        }
//        else if(peso >= 10 && peso < 25){
//            porte = "Médio";
//        }
//        else{
//            porte = "Grande";
//        }
//        System.out.println("Nome: " + nome + "\nEspécie: " + especie + "\nPeso: " + peso + "\nPorte: " + porte);

        Scanner sc = new Scanner(System.in);
        Pet[] pets = new Pet[5];
        HashSet<String> especies = new HashSet<>();
        int totalPets = 0;
        int escolha = 1;
        while(escolha != 0) {
            System.out.println("Digite sua opção: \n" +
                    "Digite 1 para cadastrar um pet\n" +
                    "Digite 2 para ver lista de pets\n" +
                    "Digite 4 para ver lista de especies cadastradas" +
                    "Digite 3 para consultar um pet\n" +
                    "Digite 4 para adicionar um pet na fila de banho" +
                    "Digite 5 para sair ");
           try {
                escolha = sc.nextInt();
                sc.nextLine();
                switch (escolha) {
                    case 1:
                        System.out.println("Digite o nome do seu animal: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a espécie do seu animal: ");
                        String especie = sc.nextLine();
                        System.out.println("Digite o peso do seu animal: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();
                        Pet animal = new Pet();
                        animal.nome = nome;
                        animal.especie = especie;
                        animal.peso = peso;
                        animal.verificaPorte(peso);
                        especies.add(especie);
                        pets[totalPets] = animal;
                        totalPets++;
                        break;
                    case 2:
                        System.out.println("=== PETS CADASTRADOS ===");
                        for (int i = 0; i < totalPets; i++) {
                            System.out.println("Nome: " + pets[i].nome + "\nEspécie: " + pets[i].especie + "\nPeso: "
                                    + pets[i].peso + "\nPorte: " + pets[i].porte + "\n========================");
                        }
                        System.out.println("Total de pets cadastrados: " + totalPets);
                        break;

                    case 3:
                        System.out.println("Digite do pet que deseja encontrar: ");
                        String nomeProcurado = sc.nextLine();
                        for (int i = 0; i < totalPets; i++) {
                            if (pets[i].nome.equalsIgnoreCase(nomeProcurado)) {
                                System.out.println("Encontrado: " + pets[i].nome + " (" + pets[i].especie + ") - "
                                        + pets[i].peso);
                            } else {
                                System.out.println("Pet não encontrado");
                            }

                        }
                    case 4:
                        System.out.println("=== Especies Cadastradas ===\n");
                        for(String e : especies){
                            System.out.println(e);
                        }

                    case 5:
                        escolha = 0;
                        break;
                    default:
                        System.out.println("Opção inválida, digite novamente");
                }

            }catch(InputMismatchException ex){
               System.out.println("Você digitou uma entrada inválida, digite novamente: ");
               sc.nextLine();
               escolha = sc.nextInt();
           }
        }

    }
}