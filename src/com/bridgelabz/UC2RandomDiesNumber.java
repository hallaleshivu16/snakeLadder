package com.bridgelabz;

import java.util.Random;

public class UC2RandomDiesNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to snake ladder game");
        final int NUMBER_OF_PLAYER = 1;
        final int START_POSITION = 0;
        Random random = new Random();
        int rollDie = random.nextInt(1,7);
        System.out.println("Dies Number: " + rollDie);
    }
}
