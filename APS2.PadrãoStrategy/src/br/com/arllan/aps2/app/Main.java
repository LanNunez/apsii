package br.com.arllan.aps2.app;

import br.com.arllan.aps2.characters.King;
import br.com.arllan.aps2.characters.Knight;
import br.com.arllan.aps2.characters.Queen;
import br.com.arllan.aps2.characters.Troll;
import br.com.arllan.aps2.weapons.AxeBehavior;
import br.com.arllan.aps2.weapons.SwordBehavior;

public class Main {

    public static void main(String[] args) {

        King king = new King();
        Queen queen = new Queen();
        Knight knight = new Knight();
        Troll troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();

        System.out.println("\n--- Trocando as armas ---");

        king.setWeapon(new AxeBehavior());
        king.fight();

        troll.setWeapon(new SwordBehavior());
        troll.fight();
    }
}