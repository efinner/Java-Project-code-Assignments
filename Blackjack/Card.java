package Blackjack;

public class Card {
    // Fields
    private int value; // The numeric value of the card
    private String suit; // The suit of the card (e.g., Hearts)
    private String name; // The name of the card (e.g., Ace, Two, etc.)

    // Constructor
    public Card(int value, String suit, String name) {
        this.value = value;
        this.suit = suit;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Describe method
    public void describe() {
        System.out.println(name + " of " + suit); // Prints the card's details
    }
}
