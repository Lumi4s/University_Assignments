package io.github.ProgrammingPatterns3.strategy;

import io.github.ProgrammingPatterns3.punic.Warrior;

public interface AttackStrategy {
    void attack(Warrior attacker, Warrior target);
}
