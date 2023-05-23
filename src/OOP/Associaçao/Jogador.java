package OOP.Associaçao;

public class Jogador {

    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void printar() {
        System.out.println(this.name);
        if (time != null) {
            System.out.println(this.time.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return name;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
