package listSetMap;

import java.util.HashSet;
import java.util.Set;

import OOP.dominio.Pessoa;

public class EstudosSet {
    public static void main(String[] args) {

        // hashSet é a classe que implementa o set;
        Set<Pessoa> pessoas = new HashSet<>();

        Pessoa amanda = new Pessoa("Amanda", 1L);
        Pessoa paulo = new Pessoa("Paulo", 2L);
        pessoas.add(amanda);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getName());
        }

        System.out.println("----------------------------");

        pessoas.add(paulo);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getName());
        }
    }
}
