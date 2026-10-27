package br.com.arllan.aps2.characters;

import br.com.arllan.aps2.weapons.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("O troll está lutando.");
        useWeapon();
    }
}