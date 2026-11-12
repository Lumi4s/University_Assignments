package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class BowAttackStrategy implements AttackStrategy {

    @Override
    public void attack(Warrior attacker, Warrior target) {
        System.out.println(attacker.getName() + " shots from bow from far away (damage: " + attacker.getDamage() + ")!");
        target.takeDamage(attacker.getDamage());
    }
}