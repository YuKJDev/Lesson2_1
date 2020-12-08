package ru.geekbrains.stage2;

public interface IActions {

    void doMove(int length);

    void doJump(int height);

    boolean isMove();

    boolean isJump();

}
