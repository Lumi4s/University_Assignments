package io.github.ProgrammingPatterns.builder;

import io.github.ProgrammingPatterns.punic.Warrior;

public interface WarriorBuilder {

    WarriorBuilder setName(String name);

    WarriorBuilder setHealth(int health);

    WarriorBuilder setDamage(int damage);

    WarriorBuilder setSpeed(int speed);

    WarriorBuilder setDefense(int defense);

    Warrior build();
}