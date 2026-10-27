package br.com.arllan.aps2.characters;

import br.com.arllan.aps2.weapons.KnifeBehavior;

public class Knight extends Character {

    public Knight() {
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("O cavaleiro está lutando.");
        useWeapon();
    }
}