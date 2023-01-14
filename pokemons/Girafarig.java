package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Girafarig extends Pokemon {
    public Girafarig(String name, int lvl) {
        super(name, lvl);
        setStats(70,80,65,90,65,85);
        setType(Type.NORMAL,Type.PSYCHIC);
        setMove(new DoubleKick(), new Confusion(), new Facade(), new Crunch());
    }
}
