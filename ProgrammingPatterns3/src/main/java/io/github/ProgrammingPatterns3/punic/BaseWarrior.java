package io.github.ProgrammingPatterns3.punic;

import io.github.ProgrammingPatterns3.strategy.AttackStrategy;

public abstract class BaseWarrior implements Warrior {
    protected String name;
    protected int health;
    protected int damage;
    protected int speed;
    protected int defense;
    protected AttackStrategy attackStrategy; // Поле стратегии

    public BaseWarrior(String name, int health, int damage, int speed, int defense) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.defense = defense;
    }

    @Override
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    @Override
    public void attack(Warrior target) {
        if (attackStrategy == null) {
            System.out.println(name + " have no weapon or strategy to attack!");
            return;
        }
        attackStrategy.attack(this, target);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    // Методы move(), takeDamage() и doQualityCheck() остаются без изменений
    @Override
    public void move() {
        System.out.println(name + " moves with speed " + speed);
    }

    @Override
    public void takeDamage(int incomingDamage) {
        health -= Math.max(0, incomingDamage - defense);
        health = Math.max(0, health);
        if (health == 0) {
            System.out.println(name + " died!");
        }
    }

    public boolean doQualityCheck() {
        return (name != null && !name.trim().isEmpty()) && (health > 0)
                && (damage >= 0) && (speed >= 0) && (defense >= 0);
    }
}