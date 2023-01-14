package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Barboach extends Pokemon{
    public Barboach(String name, int lvl) {
        super(name, lvl);
        setStats(50, 48, 43, 46, 41, 60);
        setType(Type.WATER, Type.GROUND);
        setMove(new DoubleTeam(), new Facade(), new RockTomb());
    }
}
