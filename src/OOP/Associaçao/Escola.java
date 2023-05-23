package OOP.Associaçao;

public class Escola {

    private String name;
    private Professor[] professores;

    public Escola(String name) {
        this.name = name;
    }

    public void printar() {
        System.out.println(this.name);
        if (professores == null)
            return;

        for (Professor professor : professores) {
            System.out.println(professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
