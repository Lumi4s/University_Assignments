package io.github.ProgrammingPatterns3.builder;

import io.github.ProgrammingPatterns3.punic.Archer;
import io.github.ProgrammingPatterns3.punic.Warrior;
import io.github.ProgrammingPatterns3.strategy.BowAttackStrategy;

public class ArcherBuilder implements WarriorBuilder {
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
        Archer archer = new Archer(name, health, damage, speed, defense);
        if (archer.doQualityCheck()) {
            return archer;
        } else {
            System.out.println("Archer build is incomplete.");
        }

        archer.setAttackStrategy(new BowAttackStrategy());

        return null;
    }


}
