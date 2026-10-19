package org.example.modulo2.revisao4;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(){
        System.out.printf("Notificação de Email: ");
    }

}
