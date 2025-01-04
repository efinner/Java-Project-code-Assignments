package GuesstheNumber;

public class Number {
int value;

//constructor
public Number(int value) {
	this.setValue(value);
}
private int setValue(int value) {
	return value;
	
}
public void describe() {
	System.out.println(value);
}
}
