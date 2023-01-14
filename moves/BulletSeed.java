package lab2.moves;
import ru.ifmo.se.pokemon.*;

public class BulletSeed extends PhysicalMove{
    public BulletSeed(){
        /*
        Здесь, по-хорошему, нужно задать возможность 2-5 ударов, но их количество задается только через конструктор.
        И attack(), где как раз и учитывается парметр hits, не переопределить, так как он final
         */
        super(Type.GRASS,25,100,5/8,3);
    }
    protected String describe() {
        return "использует Bullet Seed";
    }
}
