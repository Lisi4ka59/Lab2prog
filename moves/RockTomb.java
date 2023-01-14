package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK,60,95,5/8,1);
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, (int) p.getStat(Stat.SPEED) - 1);
    }
    protected String describe() {
        return "использует Rock Tomb";
    }
}
