package io.github.ProgrammingPatterns3.punic;

import io.github.ProgrammingPatterns3.strategy.AttackStrategy;

public interface Warrior {
    void info();

    void move();

    void takeDamage(int damage);

    void attack(Warrior target);

    void setAttackStrategy(AttackStrategy strategy);

    String getName();
    int getDamage();
}