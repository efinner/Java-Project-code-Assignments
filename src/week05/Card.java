package week05;

public class Card {
//fields
	private String name;
	private String suit;
	private int value;
	//constructor
	public Card(String name, String suit, int value) {
		this.setName(name); // or this.name=name;
		this.setSuit(suit); // or this.name=suit;
		this.setValue(value); // or this.name=value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void describe(){
		System.out.println(name + " of " + suit + "---" + value) ;  //or sysout(this.name + "of" + this.suit + "---" + thiss.value);
	}
}
