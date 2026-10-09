package org.example.modulo1.interfaces;
import org.example.modulo1.interfaces.animais.Animal;
import org.example.modulo1.interfaces.animais.Cachorro;
import org.example.modulo1.interfaces.animais.Gato;

import java.util.ArrayList;

public class ExerciciosInterfaces {
    static void main() {

//        1. Crie uma interface Animal com o método emitirSom().
//        Crie a classe Cachorro que implementa ela e imprime "Au au!".
//        Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
//        2. Agora acrescente a classe Gato, que implementa a mesma interface e
//        imprime "Miau!". Na main, declare as duas variáveis como Animal:
//
//        Animal bidu = new Cachorro();
//        Animal salem= new Gato();
//        Chame emitirSom() nas duas.

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        Gato gato = new Gato();
        gato.emitirSom();

//        3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
//        e percorra com for-each chamando emitirSom(). Repare que não
//        tem nenhum if.
        ArrayList<Animal> animais = new ArrayList<>();
     //   animais.add(Cachorro rex = new Cachorro());
        animais.add(new Gato());
        System.out.println(animais);



    }
}
