package ru.geekbrains.stage2;

public class Robot implements IActions {
    @Override
    public boolean isMove() {
        return isMove;
    }

    @Override
    public boolean isJump() {
        return isJump;
    }

    private boolean isMove;
    private boolean isJump;


    public Robot(boolean isMove, boolean isJump) {
        this.isMove = isMove;
        this.isJump = isJump;
    }

    @Override
    public void doMove(int length) {
        int MAX_MOVE = 1000;
        if (isJump) {
            if (length >= 1 && length <= MAX_MOVE) {
                System.out.println("Робот успешно пробежал дистанцию " + length + " м.");
                isMove = true;
            } else {
                System.out.println("Робот не смог пробежать дистанцию " + length + " м.");
                isMove = false;
            }
        }

    }

    @Override
    public void doJump(int height) {
        if (isMove) {
            int MAX_JUMP = 2;
            if (height >= 0 && height <= MAX_JUMP) {
                System.out.println("Робот успешно перепрыгнул через стену " + height + " м.");
                isJump = true;
            } else {
                System.out.println("Робот не смог перепрыгнуть через стену " + height + " м.");
                isJump = false;
            }

        }
    }

}
