package ru.geekbrains.stage2;

public class Cat implements IActions {
    private boolean isMove;
    private boolean isJump;

    public Cat(boolean isMove, boolean isJump) {
        this.isMove = isMove;
        this.isJump = isJump;
    }

    @Override
    public boolean isMove() {
        return isMove;
    }

    @Override
    public boolean isJump() {
        return isJump;
    }

    @Override
    public void doMove(int length) {
        int MAX_MOVE = 500;
        if (isJump) {
            if (length >= 1 && length <= MAX_MOVE) {

                System.out.println("Кот успешно пробежал дистанцию " + length + " м.");
                isMove = true;
            } else {
                System.out.println("Кот не смог пробежать дистанцию " + length + " м.");
                isMove = false;
            }
        }

    }

    @Override
    public void doJump(int height) {
        if (isMove) {
            int MAX_JUMP = 3;
            if (height >= 1 && height <= MAX_JUMP) {
                System.out.println("Кот успешно перепрыгнул через стену " + height + " м.");
                isJump = true;
            } else {
                System.out.println("Кот не смог перепрыгнуть через стену " + height + " м.");
                isJump = false;
            }

        }
    }

}
