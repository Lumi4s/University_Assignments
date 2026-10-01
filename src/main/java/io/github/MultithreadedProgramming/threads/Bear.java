package io.github.MultithreadedProgramming.threads;

import java.util.concurrent.ThreadLocalRandom;

public class Bear implements Runnable {

    private final HoneyPot pot;

    public Bear(HoneyPot pot) {
        this.pot = pot;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            try {
                pot.eatHoney();
                Thread.sleep(ThreadLocalRandom.current().nextInt(450, 551));

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}