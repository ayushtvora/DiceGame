package com.example.dicegame;
import java.util.Scanner;

class Player {

    private Scanner scanner = new Scanner(System.in);
    private Dices dices = new Dices();
    int score;
    String name;

    void turn() {
        System.out.println(name + ", please press Enter to roll the dice.");
        scanner.nextLine();
        score += dices.roll();
        System.out.println();
    }
}
