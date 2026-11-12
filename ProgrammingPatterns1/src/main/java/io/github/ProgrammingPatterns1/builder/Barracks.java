package io.github.ProgrammingPatterns1.builder;

import io.github.ProgrammingPatterns1.punic.Warrior;

public class Barracks {

    private final WarriorBuilder builder;

    public Barracks(WarriorBuilder builder) {
        this.builder = builder;
    }

    public Warrior trainWarrior(String name, int health, int damage,
                                int speed, int defense) {
        return builder.setName(name).setHealth(health).setDamage(damage).setSpeed(speed).setDefense(defense).build();
    }
}
