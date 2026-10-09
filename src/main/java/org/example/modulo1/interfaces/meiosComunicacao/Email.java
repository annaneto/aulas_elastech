package org.example.modulo1.interfaces.meiosComunicacao;

public class Email implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Notificação de email: " + mensagem);
    }
}
