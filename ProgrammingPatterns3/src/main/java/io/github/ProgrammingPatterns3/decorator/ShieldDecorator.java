package io.github.ProgrammingPatterns3.decorator;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class ShieldDecorator extends WarriorDecorator {

    private int shieldPoints;

    public ShieldDecorator(Warrior warrior, int shieldPoints) {
        super(warrior);
        this.shieldPoints = shieldPoints;
    }

    @Override
    public void takeDamage(int damage) {
        int absorbed = Math.min(shieldPoints, damage);

        shieldPoints -= absorbed;

        int remainingDamage = damage - absorbed;

        System.out.println("Shield absorbed " + absorbed + " damage.");

        if (remainingDamage > 0) {
            warrior.takeDamage(remainingDamage);
        }
    }

    @Override
    public void info() {
        warrior.info();
        System.out.println("Shield: " + shieldPoints);
    }
}
