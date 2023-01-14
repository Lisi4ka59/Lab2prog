package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Whiscash("Whiscash", 3));
        battle.addAlly(new Girafarig("Girafarig", 4));
        battle.addAlly(new Roselia("Roselia", 2));
        battle.addFoe(new Barboach("Barboach", 5));
        battle.addFoe(new Budew("Budew", 1));
        battle.addFoe(new Roserade("Roserade", 3));
        battle.go();
    }
}
