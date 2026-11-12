package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public class SlashAttackStrategy implements AttackStrategy{

    @Override
    public void attack(Warrior attacker, Warrior target) {
        System.out.println(attacker.getName() + " slashes with sword (damage: " + attacker.getDamage() + ")!");
        target.takeDamage(attacker.getDamage());
    }
}
