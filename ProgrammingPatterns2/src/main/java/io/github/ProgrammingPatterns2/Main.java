package io.github.ProgrammingPatterns2;

import io.github.ProgrammingPatterns2.builder.*;
import io.github.ProgrammingPatterns2.decorator.ShieldDecorator;
import io.github.ProgrammingPatterns2.decorator.WarriorDecorator;
import io.github.ProgrammingPatterns2.punic.Warrior;

public class Main {
    static void main() {
        WarriorBuilder archerBuilder = new ArcherBuilder();
        WarriorBuilder horsemanBuilder = new HorsemanBuilder();
        WarriorBuilder infantrymanBuilder = new InfantrymanBuilder();

        Barracks archerBarracks = new Barracks(archerBuilder);
        Barracks horsemanBarracks = new Barracks(horsemanBuilder);
        Barracks infantrymanBarracks = new Barracks(infantrymanBuilder);


        Warrior archer = archerBarracks.trainWarrior("archer", 10, 2, 1, 0);
        Warrior horseman = horsemanBarracks.trainWarrior("horseman", 20, 5, 10, 5);
        Warrior infantryman = infantrymanBarracks.trainWarrior("infantryman", 30, 4, 4, 6);

        WarriorDecorator shieldedArcher = new ShieldDecorator(
                archerBarracks.trainWarrior("archer", 10, 2, 1, 0),
                5);

        archer.info();
        System.out.println();
        horseman.info();
        System.out.println();
        infantryman.info();
        System.out.println();
        shieldedArcher.info();
    }
}