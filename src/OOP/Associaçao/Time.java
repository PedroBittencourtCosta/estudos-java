package OOP.Associaçao;

public class Time {

    private String name;
    private Jogador[] jogadores;

    // Metodos construtores
    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    // Metodos proprios

    public void printar() {
        System.out.println(this.name);
        if (jogadores == null)
            return;
        for (Jogador jogador : jogadores) {
            jogador.printar();
        }
    }

    // metodos getters and setters

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
