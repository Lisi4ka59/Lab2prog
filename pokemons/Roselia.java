package lab2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Roselia extends Budew{
    public Roselia(String name, int lvl) {
        super(name, lvl);
        setStats(50, 60, 45, 100, 80, 65);
        addMove(new BulletSeed());
    }
}
