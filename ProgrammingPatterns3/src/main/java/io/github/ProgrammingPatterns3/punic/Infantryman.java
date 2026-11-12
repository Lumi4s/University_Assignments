package io.github.ProgrammingPatterns3.punic;

public class Infantryman extends BaseWarrior {

    public Infantryman(String name, int health, int damage,
                       int speed, int defense) {
        super(name, health, damage, speed, defense);
    }

    @Override
    public void info() {
        System.out.println("Infantryman: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Speed: " + speed);
        System.out.println("Defense: " + defense);
    }
}