package com.example.dicegame;
import java.util.Random;

class Dices {

    private Random random = new Random();

    int roll() {
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        int diceValue;
        if (dice1 == dice2) {
             diceValue = -(dice1 + dice2);
        } else {
            diceValue = dice1 + dice2;
        }

        System.out.println("Roll: " + dice1 + " & " + dice2 + ". Total: " + diceValue);

        return diceValue;
    }
}
