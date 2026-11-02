package io.github.ProgrammingPatterns.builder;

import io.github.ProgrammingPatterns.punic.Infantryman;
import io.github.ProgrammingPatterns.punic.Warrior;

public class InfantrymanBuilder implements WarriorBuilder {
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
        Infantryman infantryman = new Infantryman(name, health, damage, speed, defense);
        if (infantryman.doQualityCheck()) {
            return infantryman;
        } else {
            System.out.println("Infantryman build is incomplete.");
        }

        return null;
    }
}
