package io.github.ProgrammingPatterns.punic;

public class Horseman extends BaseWarrior {

    public Horseman(String name, int health, int damage,
                    int speed, int defense) {
        super(name, health, damage, speed, defense);
    }

    @Override
    public void info() {
        System.out.println("Horseman: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Speed: " + speed);
        System.out.println("Defense: " + defense);
    }
}