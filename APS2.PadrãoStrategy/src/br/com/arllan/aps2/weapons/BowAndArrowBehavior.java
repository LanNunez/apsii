package br.com.arllan.aps2.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Atirando uma flecha com um arco.");
    }
}