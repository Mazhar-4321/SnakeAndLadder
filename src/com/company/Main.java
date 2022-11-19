package com.company;

import java.util.*;

public class Main {
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WINNING_POSITION = 100;
    static final int INITIAL_POSITION = 0;
    static final int PLAYER_1 = 1;
    static final int PLAYER_2 = 2;

    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game");
        int startPosition = INITIAL_POSITION;
        ArrayList<Integer>>player1List = new ArrayList<>();
        ArrayList<Integer>>player2List = new ArrayList<>();
        int diceCount = 0;
        int player1CurrentScore = INITIAL_POSITION;
        int player2CurrentScore = INITIAL_POSITION;
        int currentPlayer = PLAYER_1;
        while (player1CurrentScore != WINNING_POSITION || player2CurrentScore != WINNING_POSITION) {
            int dice = (int) Math.floor((Math.random() * 10) % 6) + 1;
            int option = (int) Math.floor((Math.random() * 10) % 3) + 1;
            switch (option) {
                case NO_PLAY:
                    if (currentPlayer == PLAYER_1) {
                        currentPlayer = PLAYER_2;
                    } else {
                        currentPlayer = PLAYER_1;
                    }
                    break;
                case LADDER:
                    if (currentPlayer == PLAYER_1) {
                        player1CurrentScore = player1CurrentScore + dice > WINNING_POSITION ? player1CurrentScore : player1CurrentScore + dice;
                        player1CurrentScore.add(player1CurrentScore);
                    } else {
                        player2CurrentScore = player2CurrentScore + dice > WINNING_POSITION ? player2CurrentScore : player2CurrentScore + dice;
                        player2CurrentScore.add(player2CurrentScore);
                    }
                    break;
                case SNAKE:
                    if (currentPlayer == PLAYER_1) {
                        player1CurrentScore -= dice;
                        player1CurrentScore = player1CurrentScore < INITIAL_POSITION ? INITIAL_POSITION : player1CurrentScore;
                        currentPlayer = PLAYER_2;
                        player1CurrentScore.add(player1CurrentScore);
                    } else {
                        player2CurrentScore -= dice;
                        player2CurrentScore = player2CurrentScore < INITIAL_POSITION ? INITIAL_POSITION : player2CurrentScore;
                        currentPlayer = PLAYER_1;
                        player2CurrentScore.add(player2CurrentScore);
                    }
                    break;
            }
            positionList.add(startPosition);
            diceCount++;
        }
        System.out.println("Dice Count=" + diceCount + "," + "Position List=" + positionList);
        if (player1CurrentScore == WINNING_POSITION) {
            System.out.println("Player1 Won , Positions=" + player1List);
        } else {
            System.out.println("Player2 Won, Positions=" + player2List);
        }
    }
}
