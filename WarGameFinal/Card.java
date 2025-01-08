package WarGameFinal;

public class Card {
    private int value; // 2-14 (2 for 2, ... 14 for Ace)
    private String name; // e.g., "Ace of Spades"

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Describe method
    public void describe() {
        System.out.println(name + " (Value: " + value + ")");
    }
}
