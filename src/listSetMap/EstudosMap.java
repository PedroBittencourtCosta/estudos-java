package listSetMap;

import java.util.HashMap;
import java.util.Map;

import OOP.dominio.Pessoa;

public class EstudosMap {
    public static void main(String[] args) {

        Map<Long, Pessoa> mapa = new HashMap<>();

        Pessoa pessoa01 = new Pessoa("Joaihbj", 1L);

        mapa.put(1L, pessoa01);

        System.out.println(mapa.get(1L).toString());
    }
}
