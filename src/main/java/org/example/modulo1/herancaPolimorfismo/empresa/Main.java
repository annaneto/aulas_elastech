package org.example.modulo1.herancaPolimorfismo.empresa;

public class Main {
    static void main() {
        Diretora diretora = new Diretora();
        diretora.nome = "Carla";
        diretora.baterPonto();
        diretora.aprovarFerias();
        diretora.definirMeta("R$10.000,00");

        Gerente gerente = new Gerente();
        gerente.baterPonto();
        gerente.aprovarFerias();
        gerente.notificar("Você precisa me entregar o relatório até o final da tarde.");
        gerente.exportar();


    }
}
