package org.example.modulo1.polimorfismo;

import org.example.modulo1.polimorfismo.pagamentos.Boleto;
import org.example.modulo1.polimorfismo.pagamentos.MeiodePagamento;
import org.example.modulo1.polimorfismo.pagamentos.Pix;
import org.example.modulo1.polimorfismo.pessoas.Aluna;
import org.example.modulo1.polimorfismo.pessoas.Estagiaria;
import org.example.modulo1.polimorfismo.pessoas.Pessoa;
import org.example.modulo1.polimorfismo.pessoas.Professora;

public class Main {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    static void main() {
        // 1
        double lado = 4.8;
        int raio = 5;
        double base = 10;
        double altura = 7.2;

        System.out.println("Área do quadrado: " + Calculadora.calcularArea(lado));
        System.out.printf("Área do círculo: %.2f\n", Calculadora.calcularArea(raio));
        System.out.println("Área do retângulo: " + Calculadora.calcularArea(base, altura));

        //2
        Painel.exibir("Hello World");
        Painel.exibir(24);
        Painel.exibir(23.5);
        Painel.exibir(true);

        // 3
        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";
        professora.lancarNota("Anna", 9.3);

        //4
        Pessoa estagiaria = new Estagiaria();
        estagiaria.idade = 24;
        estagiaria.nome = "Anna";
        estagiaria.apresentar();
        /* como não sobreescrevi o método apresentar  ele apresentou o comportamento original de pessoa */

        //5
        Aluna aluna = new Aluna();
        aluna.nome = "Giovana";
        aluna.idade = 18;

        mostrarFicha(estagiaria);
        mostrarFicha(professora);
        mostrarFicha(aluna);

        //6

        MeiodePagamento forma;
        forma = new Pix();
        forma.pagar(100);
        forma = new Boleto();
        forma.pagar(25.8);

        //7
        professora.apresentar();
        professora.apresentar("professora");

        // sem o override o java usa o método genêrico da classe mãe, a não ser que o método seja passado com
        // parâmetro de forma que o compliador consegue enxergar que queremos usar o método da classe filha
        // quando usamos o Override o java entende que ele precisa usar o parâmetro sobreescrito da classe filha, como
        // nesse caso a classe pessoa não tem um métoodo apresentar com parâmetro cargo, o java reclama.




    }
}
