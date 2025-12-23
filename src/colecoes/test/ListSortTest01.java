package colecoes.test;

import colecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>(6);
        games.add("Minecraft");
        games.add("Clash Royalle");
        games.add("GTA SA");
        games.add("Rocket League");
        games.add("Eatventure");

        Collections.sort(games);

        for (String game : games) {
            System.out.println(game);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(21.99);
        dinheiros.add(45.77);
        dinheiros.add(98.49);
        dinheiros.add(03.98);

        System.out.println(dinheiros);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);

        new Game(null, null, 0);
    }
}
