package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Whiscash extends Barboach{
    public Whiscash(String name, int lvl) {
        super(name, lvl);
        setStats(110, 78, 73, 76, 71, 60);
        addMove(new StoneEdge());
    }
}
