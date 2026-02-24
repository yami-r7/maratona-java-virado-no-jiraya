package colecoes.test;

import colecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>(6);
        games.add(new Game(5L, "Minecraft", 19.99));
        games.add(new Game(1L, "Clash Royalle", 4.49));
        games.add(new Game(4L, "GTA SA", 29.90));
        games.add(new Game(3L, "Rocket League", 56.99));
        games.add(new Game(2L, "Eatventure", 12.99));

        Collections.sort(games);

        for (Game game : games) {
            System.out.println(game);
        }

        Game gameToSearch = new Game(2L, "Eatventure", 12.99);

        System.out.println(Collections.binarySearch(games, gameToSearch));
    }
}
