package colecoes.test;

import colecoes.dominio.Game;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Game> games = new ArrayList<>(6);
        games.add(new Game(5L, "Minecraft", 19.99, 0));
        games.add(new Game(1L, "Clash Royalle", 4.49, 5));
        games.add(new Game(4L, "GTA SA", 29.90, 0));
        games.add(new Game(3L, "Rocket League", 56.99, 2));
        games.add(new Game(2L, "Eatventure", 12.99, 0));

        // Iterator<Game> gameIterator = games.iterator();
        // while(gameIterator.hasNext()){
        //      if(gameIterator.next().getQuantidade() == 0){
        //      gameIterator.remove();
        //      }
        // }

        games.removeIf(game -> game.getQuantidade() == 0);

        System.out.println(games);
    }
}
