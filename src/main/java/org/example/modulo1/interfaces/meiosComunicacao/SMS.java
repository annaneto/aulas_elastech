package org.example.modulo1.interfaces.meiosComunicacao;

public class SMS implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Notificação de SMS: " + mensagem);
    }
}
