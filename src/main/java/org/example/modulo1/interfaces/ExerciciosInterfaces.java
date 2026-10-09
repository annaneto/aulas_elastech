package org.example.modulo1.interfaces;
import org.example.modulo1.interfaces.animais.Animal;
import org.example.modulo1.interfaces.animais.Cachorro;
import org.example.modulo1.interfaces.animais.Gato;
import org.example.modulo1.interfaces.meiosComunicacao.Email;
import org.example.modulo1.interfaces.meiosComunicacao.Notificacao;
import org.example.modulo1.interfaces.meiosComunicacao.SMS;
import org.example.modulo1.interfaces.meiosTransporte.Carro;
import org.example.modulo1.interfaces.meiosTransporte.Moto;
import org.example.modulo1.interfaces.meiosTransporte.Veiculo;

import java.util.ArrayList;

public class ExerciciosInterfaces {
    static void main() {

//        1 e 2

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        Gato gato = new Gato();
        gato.emitirSom();

//        3

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        for(Animal animal : animais) {
            animal.emitirSom();
        }

//        4.

        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        for(Notificacao notificacao : notificacoes){
            notificacao.enviar("Sua compra foi aprovada!");
        }

//      5

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for(Veiculo veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }





    }
}
