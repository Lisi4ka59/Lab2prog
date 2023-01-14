package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Roserade extends Roselia{
    public Roserade(String name, int lvl) {
        super(name, lvl);
        setStats(60, 70, 65, 125, 105, 90);
        addMove(new DazzlingGleam());
    }
}
