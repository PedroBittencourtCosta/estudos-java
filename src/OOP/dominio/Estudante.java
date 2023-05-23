package OOP.dominio;

public class Estudante {

    private String name;
    private int age;
    private char sex;

    // bloco de inicializaçao
    // o bloco de iniciação funciona antes do construtor quando stanciamos um
    // objeto;

    {
        System.out.println("bloco deu bom");
    }

    // metodos constructor

    public Estudante() {
        System.out.println("construtor rodando");
    }
}
