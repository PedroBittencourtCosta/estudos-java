package OOP.Associaçao.teste;

import OOP.Associaçao.Escola;
import OOP.Associaçao.Professor;

public class EscolaTeste {
    public static void main(String[] args) {

        Professor profe01 = new Professor("Rodolfo");
        Professor profe02 = new Professor("Julia");
        Professor profe03 = new Professor("Algusto");

        Professor professores[] = { profe01, profe02, profe03 };
        Escola escola = new Escola("CEPI");

        escola.setProfessores(professores);

        escola.printar();
    }
}
