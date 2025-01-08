package WarGameFinal;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//fields
    private List<Card> hand; // List of Card objects
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize an empty hand
        this.score = 0; // Initialize the score
    }

    // Describe the player and their hand
    public void describe() {
        System.out.println(name + " (Score: " + score + ")");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip the top card
    public Card flip() {
        if (hand.isEmpty()) {
            return null; // No cards left to flip
        }
        return hand.remove(0); // Remove and return the top card
    }

    // Draw a card from the deck
    public void draw(Deck deck) {
        Card card = deck.draw(); // Get the top card from the deck
        if (card != null) {
            hand.add(card); // Add the card to the player's hand
        }
    }

    // Increment the player's score
    public void incrementScore() {
        score++;
    }

    // Getters
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
