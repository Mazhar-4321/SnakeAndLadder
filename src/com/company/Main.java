package com.company;

public class Main {
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WINNING_POSITION = 100;
    static final int INITIAL_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game");
        int startPosition = INITIAL_POSITION;
        int dice = (int) Math.floor((Math.random() * 10) % 6) + 1;
    }
}
}
