package io.github.ProgrammingPatterns3.decorator;

import io.github.ProgrammingPatterns3.punic.Warrior;
import io.github.ProgrammingPatterns3.strategy.AttackStrategy;

public abstract class WarriorDecorator implements Warrior {

    protected Warrior warrior;

    public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public void info() {
        warrior.info();
    }

    @Override
    public void move() {
        warrior.move();
    }

    @Override
    public void takeDamage(int damage) {
        warrior.takeDamage(damage);
    }

    @Override
    public void attack(Warrior target) {
        warrior.attack(target);
    }

    @Override
    public void setAttackStrategy(AttackStrategy strategy) {
        warrior.setAttackStrategy(strategy);
    }

    @Override
    public String getName() {
        return warrior.getName();
    }

    @Override
    public int getDamage() {
        return warrior.getDamage();
    }

}
