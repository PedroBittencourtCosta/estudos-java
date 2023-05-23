package SistemaSeminario;

public class Seminario {

    private String title;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public void printar() {
        System.out.println(this.title);
        System.out.println(this.local.getAddress());
        if (estudantes != null) {
            for (Estudante estudante : estudantes) {
                System.out.println(estudante.getName());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
