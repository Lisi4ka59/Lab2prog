package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
    public SludgeBomb(){
        super(Type.POISON,90,100,5/8,1);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3)
            Effect.poison(p);
    }
    protected String describe() {
        return "использует Sludge Bomb";
    }
}
