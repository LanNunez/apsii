package br.com.arllan.aps2.characters;

import br.com.arllan.aps2.weapons.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }

    @Override
    public void fight() {
        System.out.println("A rainha está lutando.");
        useWeapon();
    }
}