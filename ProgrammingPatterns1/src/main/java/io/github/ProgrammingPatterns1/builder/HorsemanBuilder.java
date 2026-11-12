package io.github.ProgrammingPatterns1.builder;

import io.github.ProgrammingPatterns1.punic.Horseman;
import io.github.ProgrammingPatterns1.punic.Warrior;

public class HorsemanBuilder implements WarriorBuilder {
    private String name;
    private int health;
    private int damage;
    private int speed;
    private int defense;

    @Override
    public WarriorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public WarriorBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public WarriorBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public WarriorBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public WarriorBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Override
    public Warrior build() {
        Horseman horseman = new Horseman(name, health, damage, speed, defense);
        if (horseman.doQualityCheck()) {
            return horseman;
        } else {
            System.out.println("Horseman build is incomplete.");
        }

        return null;
    }


}
