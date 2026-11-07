package io.github.ProgrammingPatterns2.decorator;

import io.github.ProgrammingPatterns2.punic.Warrior;

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

}
