package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,5/8,5/8,1);
    }
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, (int) p.getStat(Stat.EVASION) + 1);
    }
    protected String describe() {
        return "использует Double Team";
    }
}
