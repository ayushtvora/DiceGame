package com.example.dicegame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Welcome to the Dice Game!");
        System.out.println("You will take turns rolling 2 dice.");
        System.out.println("HOWEVER, if you roll doubles, you will lose that many points!");
        System.out.println("Player 1, Please enter your name: ");
        player1.name = scanner.nextLine();
        System.out.println("Welcome, " + player1.name + "!");
        System.out.println("Player 2, Please enter your name: ");
        player2.name = scanner.nextLine();
        System.out.println("Welcome, " + player2.name + "!");

        System.out.println("How many points would you like to play until?");
        int maxPoints = scanner.nextInt();

        while (player1.score < maxPoints && player2.score < maxPoints) {
            player1.turn();
            System.out.println("Current Score:");
            System.out.println(player1.name + ": " + player1.score);
            System.out.println(player2.name + ": " + player2.score);
            player2.turn();
            System.out.println("Current Score:");
            System.out.println(player1.name + ": " + player1.score);
            System.out.println(player2.name + ": " + player2.score);
        }

        if (player1.score > player2.score) {
            System.out.println("Congratulations, " + player1.name + "! You win!");
        } else if (player1.score < player2.score) {
            System.out.println("Congratulations, " + player2.name + "! You win!");
        } else {
            System.out.println("The game was a tie! Good job both of you!");
        }
    }
}
