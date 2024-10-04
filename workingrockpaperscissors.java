package Lab4;

import java.util.Random;
import java.util.Scanner;

public class workingrockpaperscissors {
        public static void main(String[] args) {
            String playerHand, myHand;
            int yourScore, myScore, rounds;
            Scanner input = new Scanner(System.in);

            System.out.println("Best of (how many games): ");
            rounds = input.nextInt();
            input.nextLine(); // consume newline after integer input
            myScore = 0;
            yourScore = 0;

            while (rounds > 0) {
                System.out.println("My Score: " + myScore + "\tGames remaining: " + rounds + "\nYour Score: " + yourScore);
                System.out.println("Type in your hand (Rock, Paper, Scissors): ");
                playerHand = input.nextLine().toLowerCase(); // make the input case-insensitive

                // Generate computer's hand
                int hand = new Random().nextInt(3); // 0, 1, or 2
                if (hand == 0) {
                    myHand = "rock";
                } else if (hand == 1) {
                    myHand = "paper";
                } else {
                    myHand = "scissors";
                }

                System.out.println("I play " + myHand);

                // Compare hands
                if (myHand.equals(playerHand)) {
                    System.out.println("The result is a draw");
                } else if (myHand.equals("scissors") && playerHand.equals("rock")
                        || myHand.equals("paper") && playerHand.equals("scissors")
                        || myHand.equals("rock") && playerHand.equals("paper")) {
                    System.out.println("You win!");
                    yourScore++;
                } else {
                    System.out.println("fat loser");
                    myScore++;
                }

                rounds--; // Decrease rounds after each game
            }

            System.out.println("Final Score - You: " + yourScore + " | Me: " + myScore);
            if (yourScore > myScore) {
                System.out.println("You won the series!");
            } else if (myScore > yourScore) {
                System.out.println("I won the series!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
