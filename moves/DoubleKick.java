package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class DoubleKick extends PhysicalMove {
    public DoubleKick(){
        //contact
        super(Type.FIGHTING,30,100,5/8,2);
    }
    protected String describe() {
        return "использует Double Kick";
    }
}
