package io.github.Concurrentnost;

import io.github.Concurrentnost.threads.Bear;
import io.github.Concurrentnost.threads.Bee;
import io.github.Concurrentnost.threads.HoneyPot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) throws IOException {

        System.out.print("N: ");
        int N = readInt();

        System.out.print("H: ");
        int H = readInt();

        HoneyPot pot = new HoneyPot(H);

        Thread bear = new Thread(new Bear(pot), "Bear");
        bear.start();

        List<Thread> beeThreads = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Thread beeThread = new Thread(
                    new Bee(pot),
                    "Bee" + i
            );

            beeThread.start();
            beeThreads.add(beeThread);
        }
    }

    private static int readInt() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(reader.readLine());
    }
}