package br.com.arllan.aps2.characters;

import br.com.arllan.aps2.weapons.SwordBehavior;

public class King extends Character {

    public King() {
        setWeapon(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("O rei está lutando.");
        useWeapon();
    }
}