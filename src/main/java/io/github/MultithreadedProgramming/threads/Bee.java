package io.github.MultithreadedProgramming.threads;

import java.util.concurrent.ThreadLocalRandom;

public class Bee implements Runnable {

    private final HoneyPot pot;

    public Bee(HoneyPot pot) {
        this.pot = pot;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            try {
                pot.addHoney();

                Thread.sleep(ThreadLocalRandom.current().nextInt(150, 251));

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}