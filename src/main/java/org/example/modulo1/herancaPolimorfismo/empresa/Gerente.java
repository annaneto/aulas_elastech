package org.example.modulo1.herancaPolimorfismo.empresa;

public class Gerente extends Funcionario implements Exportavel, Notificavel{

    public void aprovarFerias(){
        System.out.println("Você aprovou ferias!");
    }
    @Override
    public void exportar(){
        System.out.println("Exportando");
    }
    @Override
    public void notificar(String mensagem){
        System.out.println("Notificando: " + mensagem);
    }
}
