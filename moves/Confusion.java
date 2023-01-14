package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class Confusion  extends SpecialMove{
    public Confusion(){
        super(Type.PSYCHIC,50,100,5/8,1);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.confuse(p);
    }
    protected String describe() {
        return "использует Confusion";
    }
}
