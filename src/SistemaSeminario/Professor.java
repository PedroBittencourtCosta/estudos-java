package SistemaSeminario;

public class Professor {

    private String name;
    private String especialidade;
    private Seminario[] seminarios;

    //////////////////////////////////////////////////////////////
    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    /////////////////////////////////////////////////////////////////

    public void printar() {
        System.out.println(this.name);
        System.out.println(this.especialidade);
        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println(seminario.getTitle());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
