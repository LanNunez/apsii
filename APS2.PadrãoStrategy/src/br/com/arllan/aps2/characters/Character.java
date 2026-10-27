package br.com.arllan.aps2.characters;

import br.com.arllan.aps2.weapons.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        if (weapon != null) {
            weapon.useWeapon();
        } else {
            System.out.println("Este personagem está sem arma.");
        }
    }
}