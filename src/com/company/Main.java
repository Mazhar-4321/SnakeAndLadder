package com.company;

public class Main {
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WINNING_POSITION = 100;
    static final int INITIAL_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game");
        int startPosition = INITIAL_POSITION;
        while (startPosition <= WINNING_POSITION) {
            int dice = (int) Math.floor((Math.random() * 10) % 6) + 1;
            int option = (int) Math.floor((Math.random() * 10) % 3) + 1;
            switch (option) {
                case LADDER:
                    startPosition += dice;
                    break;
                case SNAKE:
                    startPosition -= dice;
                    startPosition = startPosition < INITIAL_POSITION ? INITIAL_POSITION : startPosition;
                    break;
            }
        }
    }
}
