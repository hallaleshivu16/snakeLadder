package com.bridgelabz;

import java.util.*;

public class UC4playerReachesTo100Position {
    public static int POSITION=0;
    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder game");
        int currentPosition=0;
        Random random = new Random();
        final	int NO_PLAY=1;
        final	int LADDER=2;
        final	int SNAKE=3;
        random = new Random();

        //ROLL DIE FOR PLAYER 1
        int rollDie= random.nextInt(1,7);
        //CHECK FOR OPTION for Play
        int checkOption=random.nextInt(1,4);
        System.out.println("Roll Die :" + rollDie + " Option for Play :" +checkOption);
        //player win by 100 Position
        while ( POSITION <= 100) {
            switch (checkOption) {
                case NO_PLAY:
                    System.out.println("No Play: ");
                    System.out.println("Die face value: " + rollDie);
                    System.out.println("Player current Position is: " + POSITION);
                    break;
                case LADDER:
                    System.out.println("Ladder: ");
                    System.out.println("Die face value: " + rollDie);
                        POSITION = POSITION + rollDie;
                        if (POSITION <= 100) {
                            POSITION = POSITION;
                            System.out.println("Player current Position is: " + POSITION);
                        }
                    break;
                case SNAKE:
                    System.out.println("Snake: ");
                    System.out.println("Die face value: " + rollDie);
                    if (POSITION > 0) {
                        POSITION = POSITION - rollDie;
                        if (POSITION >= 0) {
                            POSITION = POSITION;
                        }
                    } else
                        System.out.println("You can't go down any further.");
                    System.out.println("Player current Position is: " + POSITION);
                    break;

            }
        }
    }
}

