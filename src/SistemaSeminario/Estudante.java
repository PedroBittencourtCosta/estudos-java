package SistemaSeminario;

public class Estudante {

    private String name;
    private Integer year;
    private Seminario seminario;

    public Estudante(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public void printar() {
        System.out.println(this.name);
        System.out.println(this.year);
        System.out.println(this.seminario.getTitle());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}
