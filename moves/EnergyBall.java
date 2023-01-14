package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS,90,100,5/8,1);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1)
            p.setMod(Stat.SPECIAL_DEFENSE, (int) p.getStat(Stat.SPECIAL_DEFENSE) - 1);
    }
    protected String describe() {
        return "использует Energy Ball";
    }
}
