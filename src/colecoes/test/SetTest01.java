package colecoes.test;

import colecoes.dominio.Game;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Game> games = new LinkedHashSet<>();
        games.add(new Game(5L, "Minecraft", 19.99));
        games.add(new Game(1L, "Clash Royalle", 4.49));
        games.add(new Game(4L, "GTA SA", 29.90));
        games.add(new Game(3L, "Rocket League", 56.99));
        games.add(new Game(2L, "Eatventure", 12.99));

        for (Game game : games) {
            System.out.println(game);
        }
    }
}
