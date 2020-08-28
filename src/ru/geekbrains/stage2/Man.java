package ru.geekbrains.stage2;

public class Man implements IActions {
    private boolean isMove;
    private boolean isJump;
    private int length;

    public Man(boolean isMove, boolean isJump) {
        this.isMove = isMove;
        this.isJump = isJump;

    }

    public boolean isMove() {
        return isMove;
    }

    public boolean isJump() {
        return isJump;
    }

    @Override
    public void doMove(int length) {
        int MAX_MOVE = 400;
        if (isJump) {
            this.length = length;
            if (length >= 1 && length <= MAX_MOVE) {
                System.out.println("Человек успешно пробежал дистанцию " + length + " м.");
                isMove = true;

            } else {
                System.out.println("Человек  не смог пробежать дистанцию " + length + " м.");
                isMove = false;


            }
        }

    }

    @Override
    public void doJump(int height) {
        int MAX_JUMP = 1;

        if (isMove) {
            if (height >= 0 && height <= MAX_JUMP) {
                System.out.println("Человек успешно перепрыгнул через стену " + height + " м.");
                isJump = true;
            } else {
                System.out.println("Человек  не смог перепрыгнуть через стену " + height + " м.");
                isJump = false;

            }

        }
    }
}
