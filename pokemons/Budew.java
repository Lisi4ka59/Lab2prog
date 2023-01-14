package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Budew extends Pokemon{
    public Budew(String name, int lvl) {
        super(name, lvl);
        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.GRASS, Type.POISON);
        setMove(new EnergyBall(), new SludgeBomb());
    }
}
