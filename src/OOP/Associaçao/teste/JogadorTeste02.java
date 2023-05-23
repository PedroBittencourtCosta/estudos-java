package OOP.Associaçao.teste;

import OOP.Associaçao.Jogador;
import OOP.Associaçao.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("cafu");
        Jogador jogador02 = new Jogador("Ronaldinho");
        Jogador jogador03 = new Jogador("Casio");

        Time time = new Time("Santos");
        Time time02 = new Time("Barsa");

        Jogador[] jogadors = { jogador01, jogador03, jogador02 };
        jogador01.setTime(time);
        jogador02.setTime(time02);
        jogador03.setTime(time);

        time.setJogadores(jogadors);

        time.printar();

    }
}
