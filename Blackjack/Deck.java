package Blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards; // List of Card objects

    // Constructor to initialize and populate the deck
    public Deck() {
        cards = new ArrayList<>(); // Initialize the list of cards

        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        // Populate the deck with all combinations of ranks and suits
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(values[j], suits[i], ranks[j]));
            }
        }
    }

    // Getter for cards
    public List<Card> getCards() {
        return cards;
    }

    // Setter for cards
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw a card from the deck
    public Card draw() {
        if (cards.isEmpty()) {
            return null; // Return null if the deck is empty
        }
        return cards.remove(0); // Remove and return the top card
    }

    // Describe the deck
    public void describe() {
        for (Card card : cards) {
            card.describe(); // Call the Card's describe method
        }
    }
}
