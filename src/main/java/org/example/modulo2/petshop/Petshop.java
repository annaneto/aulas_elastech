package org.example.modulo2.petshop;

import java.util.*;

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
        ArrayList<Pet> pets = new ArrayList<>();
        HashSet<String> especies = new HashSet<>();
        ArrayDeque<String> fila = new ArrayDeque<>();

        // Interface com os serviços

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());



        int escolha = 1;
        while(escolha != 0) {

            Auxiliares.opcoes();

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
                        if (especie.equalsIgnoreCase("cachorro")) {
                            Pet cao = new Cachorro(nome, peso);
                            cao.verificaPorte(peso);
                            pets.add(cao);
                        } else if (especie.equalsIgnoreCase("gato")) {
                            Pet gato = new Gato(nome, peso);
                            gato.verificaPorte(peso);
                            pets.add(gato);
                        }else {
                            Pet animal = new Pet(nome, especie, peso);
                            animal.verificaPorte(peso);
                            especies.add(especie);
                            pets.add(animal);
                        }
                        break;



                    case 2:
                        System.out.println("=== PETS CADASTRADOS ===");
                        for (Pet pet : pets) {
                            Auxiliares.imprimePet(pet);

                            Auxiliares.imprimeLinha();
                        }
                        System.out.println("Total de pets cadastrados: " + pets.size());
                        break;

                    case 3:
                        System.out.println("Digite do pet que deseja encontrar: ");
                        String nomeProcurado = sc.nextLine();
                        boolean encontrado = false;
                        for (Pet pet : pets) {
                            if (pet.nome.equalsIgnoreCase(nomeProcurado)) {
                                System.out.printf("Encontrado: ");
                                encontrado = true;
                                Auxiliares.imprimePet(pet);
                                break;

                            }
                        }
                        if(!encontrado) {
                                System.out.println("Pet não encontrado");
                            }
                        break;

                    case 4:
                        System.out.println("=== Especies Cadastradas ===\n");
                        for(String e : especies){
                            System.out.println(e);
                        }
                        break;
                    case 5:
                        System.out.println("Nome do pet que vai entrar na fila: ");
                        nome = sc.nextLine();
                        fila.add(nome);
                        System.out.printf("[%s] entrou na fila \n", nome);
                        System.out.println("Fila agora:" + fila);



                        break;
                    case 6:
                        if(!fila.isEmpty()) {
                            System.out.println("Próximo da fila: " + fila.peek());
                            System.out.println("Atendendo " + fila.poll());
                            System.out.println("Fila agora: " + fila);
                        }else{
                            System.out.println("A fila de pets está vazia");
                        }

                        break;
                    case 7:
                        System.out.println("Digite o nome do pet que será atendido: ");
                        nome = sc.nextLine();
                        for(Servico servico : servicos){
                            servico.executar(nome);
                        }
                        break;
                    case 8:
                        escolha = 0;
                        break;
                    default:
                        System.out.println("Opção inválida, digite novamente");
                }

            }catch(InputMismatchException ex){
               System.out.println("Você digitou uma entrada inválida, digite novamente: ");
               sc.nextLine();
           }
        }
    }


}