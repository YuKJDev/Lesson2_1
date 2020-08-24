package ru.geekbrains.stage2;

import java.util.Random;

public class Runts {

    public static void main(String[] args) {

        IActions[] spotrsmens = {new Man(true, true), new Robot(true,
                true), new Cat(true, true)};

        IObstacles[] obstacles = {new Treadmill(getRand(0, 1000)), new Wall(getRand(0, 4))};
        for (IActions sportsmen : spotrsmens) {
            for (IObstacles ob : obstacles) {

                ob.run(sportsmen);
            }
            System.out.println();
        }


    }

    static int getRand(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;

    }


}
