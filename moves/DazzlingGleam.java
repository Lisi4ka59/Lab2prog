package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove{
    public DazzlingGleam(){
        //Атака должна воздействовать на всех соседних противников
        //Но я хз, как это реализовать, так как список команд и зависящее от этого расположение приватные
        super(Type.FAIRY,80,100,5/8,1);
    }
    protected String describe() {
        return "использует Dazzling Gleam";
    }
}
