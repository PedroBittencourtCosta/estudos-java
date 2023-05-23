package SistemaSeminario.teste;

import SistemaSeminario.Professor;
import SistemaSeminario.Estudante;
import SistemaSeminario.Local;
import SistemaSeminario.Seminario;

public class AppTeste {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante("Alice", 15);
        Estudante estudante02 = new Estudante("Joao", 15);
        Estudante estudante03 = new Estudante("Pedro", 15);
        Estudante estudante04 = new Estudante("Lucas", 15);
        Estudante estudante05 = new Estudante("Adm", 15);

        Local local = new Local("Rio Verde");
        Local local02 = new Local("Manaus");

        Seminario seminario = new Seminario("A vida no fundo do mar", local);
        Seminario seminario02 = new Seminario("Homem aranha", local02);
        Seminario seminario03 = new Seminario("Estrutura de dados", local);

        Professor profe01 = new Professor("Augusto", "Biologia");
        Professor profe02 = new Professor("Fernando", "Fisica");

        Estudante[] alunos = { estudante03, estudante05 };
        Estudante[] alunos02 = { estudante01, estudante02, estudante04, };

        Seminario[] seminarios = { seminario, seminario02 };
        Seminario[] seminarios02 = { seminario, seminario03 };

        estudante01.setSeminario(seminario);
        estudante02.setSeminario(seminario);
        estudante03.setSeminario(seminario02);
        estudante04.setSeminario(seminario);
        estudante05.setSeminario(seminario02);

        seminario.setEstudantes(alunos02);
        seminario02.setEstudantes(alunos);

        profe01.setSeminarios(seminarios);
        profe02.setSeminarios(seminarios02);

        System.out.println("----------------------------------------------------");

        seminario.printar();
        seminario02.printar();
        seminario03.printar();

        System.out.println("----------------------------------------------------");

        profe01.printar();
        profe02.printar();

        System.out.println("----------------------------------------------------");

        estudante01.printar();
        estudante02.printar();
        estudante03.printar();
        estudante04.printar();
        estudante05.printar();

        System.out.println("----------------------------------------------------");

    }
}
