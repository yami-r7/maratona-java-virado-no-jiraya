package colecoes.test;

import colecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GameByIdComparator implements Comparator<Game> {

    @Override
    public int compare(Game game1, Game game2) {
        return game1.getId().compareTo(game2.getId());
    }
}

public class GameSortTest01 {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>(6);
        games.add(new Game(5L, "Minecraft", 19.99));
        games.add(new Game(1L, "Clash Royalle", 4.49));
        games.add(new Game(4L, "GTA SA", 29.90));
        games.add(new Game(3L, "Rocket League", 56.99));
        games.add(new Game(2L, "Eatventure", 12.99));

        for (Game game : games) {
            System.out.println(game);
        }

        Collections.sort(games);
        System.out.println("--------------------");

        for (Game game : games) {
            System.out.println(game);
        }

        Collections.sort(games, new GameByIdComparator());
        System.out.println("--------------------");

        for (Game game : games) {
            System.out.println(game);
        }

    }
}
