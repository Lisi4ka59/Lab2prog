package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        //contact
        super(Type.NORMAL,70,100,5/8,1);
    }
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double damage = (0.4D * (double)att.getLevel() + 2.0D) * this.power / 150.0D;
        if (att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE)
            {damage *= 2;
            System.out.println("Срабатывает эффект удвоения атаки");}
        return damage;
    }
    protected String describe() {
        return "использует Facade";
    }
}
