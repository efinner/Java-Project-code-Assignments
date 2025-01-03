package Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand; // The player's hand
    private int score; // The player's score
    private String name; // The player's name

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Start with an empty list of cards
        this.score = 0; // Start the score at 0
    }

    // Getters and Setters
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Draw a card from the deck and add it to the player's hand
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
            calculateScore(); // Update the score
        }
    }

    // Calculate the player's score
    public void calculateScore() {
        score = 0; // Reset the score
        for (Card card : hand) {
            score += card.getValue(); // Sum up the values of the cards in hand
        }
    }

    // Describe the player, their hand, and score
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe(); // Describe each card in the player's hand
        }
        System.out.println("Score: " + score);
    }
}
