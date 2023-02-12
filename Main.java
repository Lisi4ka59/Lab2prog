package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Whiscash("Союзник 1", 3));
        battle.addAlly(new Girafarig("Союзник 2", 4));
        battle.addAlly(new Roselia("Союзник 3", 2));
        battle.addFoe(new Barboach("Враг 1", 5));
        battle.addFoe(new Budew("Враг 2", 1));
        battle.addFoe(new Roserade("Враг 3", 3));
        battle.go();
    }
}
