package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class ShieldBashStrategy implements AttackStrategy {
    @Override
    public void attack(Warrior attacker, Warrior target) {
        int bashDamage = 2;
        System.out.println(attacker.getName() + " shield bash (damage: " + bashDamage + ")!");
        target.takeDamage(bashDamage);
    }
}