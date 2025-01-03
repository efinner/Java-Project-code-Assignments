package Blackjack;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        // Create user and dealer players
        Player user = new Player("User");
        Player dealer = new Player("Dealer");

        // Deal two cards to each player
        for (int i = 0; i < 2; i++) {
            user.draw(deck);
            dealer.draw(deck);
        }

        // Display initial hands
        System.out.println("\nInitial Hands:");
        user.describe();
        System.out.println("\nDealer's First Card:");
        if (!dealer.getHand().isEmpty()) {
            dealer.getHand().get(0).describe();
        }

        // Allow user to hit or stand
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nYour hand:");
            user.describe();

            if (user.getScore() > 21) {
                System.out.println("You bust! Dealer wins.");
                return;
            }

            System.out.println("Would you like to hit or stand (H/S)?");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("H")) {
                user.draw(deck);
            } else if (choice.equals("S")) {
                System.out.println("You stand.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'H' or 'S'.");
            }
        }

        // Dealer's turn
        while (dealer.getScore() < 17) {
            dealer.draw(deck);
        }

        // Display final scores and determine the winner
        System.out.println("\nFinal Scores:");
        user.describe();
        dealer.describe();

        if (dealer.getScore() > 21 || user.getScore() > dealer.getScore()) {
            System.out.println("You win!");
        } else if (dealer.getScore() > user.getScore()) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a draw!");
        }

        // Ask if the user wants to play again
        System.out.println("Would you like to play again? (Y/N)");
        String replayChoice = scanner.nextLine().toUpperCase();

        if (replayChoice.equals("Y")) {
            main(new String[] {}); // Restart the game by calling the main method again
        } else {
            System.out.println("Thanks for playing!");
        }

        scanner.close();
    }
}
