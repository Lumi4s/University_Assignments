package io.github.MultithreadedProgramming.threads;

public class HoneyPot {

    private final int H;
    private int currentHoney;

    public HoneyPot(int H) {
        this.H = H;
        this.currentHoney = 0;
    }

    public synchronized void addHoney() throws InterruptedException {
        while (currentHoney == H) {
            wait();
        }

        currentHoney++;

        System.out.println(
                Thread.currentThread().getName()
                        + " got some honey. Now its: "
                        + currentHoney + "/" + H
        );

        if (currentHoney == H) {
            notifyAll();
        }
    }

    public synchronized void eatHoney() throws InterruptedException {
        if (currentHoney != H) {
            wait();
        }


        System.out.println(
                Thread.currentThread().getName()
                        + " is eating."
        );

        currentHoney = 0;
        System.out.println("GLOOOORP");
        notifyAll();
    }

    public synchronized boolean isFull() {
        return currentHoney == H;
    }
}