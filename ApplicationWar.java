package WarGameFinal;

public class ApplicationWar {

    public static void main(String[] args) {
        // Create a new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Distribute cards to both players
        for (int i = 0; i < 26; i++) { // 52 cards divided between two players
            player1.draw(deck);
            player2.draw(deck);
        }

        // Game loop for flipping cards
        System.out.println("\n--- Starting the game ---\n");
        for (int i = 0; i < 26; i++) {
            // Players flip cards
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println(player1.getName() + " flipped: " + card1.getName());
            System.out.println(player2.getName() + " flipped: " + card2.getName());

            // Compare the card values
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie! No points awarded.");
            }

            System.out.println();
        }

        // Final scores and winner
        System.out.println("--- Final Scores ---");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
