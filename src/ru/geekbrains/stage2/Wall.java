package ru.geekbrains.stage2;

public class Wall implements IObstacles {

    private final int height;

    Wall(int height) {
        this.height = height;
    }


    @Override
    public void run(IActions actions) {
        actions.doJump(height);
    }
}
