package br.com.arllan.aps2.weapons;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Atacando com uma espada.");
    }
}