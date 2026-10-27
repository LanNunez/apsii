package br.com.arllan.aps2.weapons;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Usando uma faca para cortar.");
    }
}