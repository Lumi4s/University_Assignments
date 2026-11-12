package io.github.ProgrammingPatterns1.punic;

public class Archer extends BaseWarrior {

    public Archer(String name, int health, int damage,
                  int speed, int defense) {
        super(name, health, damage, speed, defense);
    }

    @Override
    public void info() {
        System.out.println("Archer: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Speed: " + speed);
        System.out.println("Defense: " + defense);
    }
}