package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class DaggerAttackStrategy implements AttackStrategy {
    @Override
    public void attack(Warrior attacker, Warrior target) {
        int daggerDamage = Math.max(1, attacker.getDamage() / 2);
        System.out.println(attacker.getName() + " hits with dagger (damage: " + daggerDamage + ")!");
        target.takeDamage(daggerDamage);
    }
}