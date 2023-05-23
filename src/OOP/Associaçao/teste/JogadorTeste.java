package OOP.Associaçao.teste;

import OOP.Associaçao.Jogador;
import OOP.Associaçao.Time;

public class JogadorTeste {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("CR7");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Pele");

        Jogador[] jogadores = { jogador01, jogador02, jogador03 };

        // for (Jogador jogador : jogadores) {
        // jogador.printar();
        // }

        Time time01 = new Time("Barcelona");

        jogador01.setTime(time01);

        jogador01.printar();
        jogador02.printar();
        jogador03.printar();
    }
}
