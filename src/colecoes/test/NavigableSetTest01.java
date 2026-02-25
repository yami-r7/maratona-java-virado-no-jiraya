package colecoes.test;

import colecoes.dominio.Game;
import colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Game> games = new TreeSet<>();
        games.add(new Game(5L, "Minecraft", 19.99, 5));
        games.add(new Game(1L, "Clash Royalle", 4.49, 0));
        games.add(new Game(4L, "GTA SA", 29.90, 2));
        games.add(new Game(3L, "Rocket League", 56.99, 0));
        games.add(new Game(2L, "Eatventure", 12.99, 0));

        for (Game game : games) {
            System.out.println(game);
        }

    }
}
