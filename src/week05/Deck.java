package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//fields
	List<Card> cards = new ArrayList<Card>(); 
	//constructor
	public Deck(){
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    for (String suit : suits) {
    for (int i=0; i<ranks.length;i++) {
    	cards.add(new Card(ranks[i], suit, values[i]));
    }
	}
	}
	
	  public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
	        Collections.shuffle(cards);
	    }

public void describe() {
	for(Card card: cards) {
		card.describe();
	}
}
	

	
	

public Card pickCard() {
	if(cards.isEmpty()) {
		return null;
	}
	return cards.remove(0);
	
}
}

