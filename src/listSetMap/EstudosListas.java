package listSetMap;

import java.util.ArrayList;
import java.util.List;

import OOP.dominio.Pessoa;

public class EstudosListas {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        // adicionar um objeto na lista
        pessoas.add(new Pessoa("Pedro", 1L));

        // recuperar um objeto
        Pessoa a = pessoas.get(0);

        // deletar ou remover um objeto da lista
        pessoas.remove(0);
        // ou
        pessoas.remove(a);

    }
}
