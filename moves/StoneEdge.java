package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80,5/8,1);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        double x = 3 * att.getStat(Stat.SPEED);
        double rand = Math.random()*512;
        if (rand <= x) {
            System.out.println("Критический удар!");
            return 2.0;
        }
        return 1.0;
    }

    protected String describe() {
        return "использует Stone Edge";
    }
}
