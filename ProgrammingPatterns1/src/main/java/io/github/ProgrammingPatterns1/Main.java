package io.github.ProgrammingPatterns1;

import io.github.ProgrammingPatterns1.builder.*;
import io.github.ProgrammingPatterns1.punic.Warrior;

public class Main {
    static void main(String[] args) {
        WarriorBuilder archerBuilder = new ArcherBuilder();
        WarriorBuilder horsemanBuilder = new HorsemanBuilder();
        WarriorBuilder infantrymanBuilder = new InfantrymanBuilder();

        Barracks archerBarracks = new Barracks(archerBuilder);
        Barracks horsemanBarracks = new Barracks(horsemanBuilder);
        Barracks infantrymanBarracks = new Barracks(infantrymanBuilder);

        Warrior archer = archerBarracks.trainWarrior("archer", 10, 2, 1, 0);
        Warrior horseman = horsemanBarracks.trainWarrior("horseman", 20, 5, 10, 5);
        Warrior infantryman = infantrymanBarracks.trainWarrior("infantryman", 30, 4, 4, 6);

        archer.info();
        horseman.info();
        infantryman.info();
    }
}