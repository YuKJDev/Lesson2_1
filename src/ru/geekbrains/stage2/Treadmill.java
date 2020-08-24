package ru.geekbrains.stage2;

public class Treadmill implements IObstacles {

    private final int length;

    Treadmill(int length) {
        this.length = length;
    }


    @Override
    public void run(IActions actions) {
        actions.doMove(length);

    }

}
