package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class HeavyStrikeStrategy implements AttackStrategy {
    @Override
    public void attack(Warrior attacker, Warrior target) {
        int bonusDamage = (int) (attacker.getDamage() * 1.5);
        System.out.println(attacker.getName() + " did heavy attack (damage: " + bonusDamage + ")!");
        target.takeDamage(bonusDamage);
    }
}