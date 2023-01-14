package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
    public Crunch(){
        //contact
        super(Type.DARK,80,100,5/8,1);
    }
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2)
            p.setMod(Stat.DEFENSE, (int) p.getStat(Stat.DEFENSE) - 1);
    }
    protected String describe() {
        return "использует Crunch";
    }
}
