package GuesstheNumber;

import java.util.Random;

public class Game {
int number;

public Game() {
	generateRandomNumber();
}

private void generateRandomNumber() {
	// Use Random to get a number between 1 and 10
	Random random = new Random();
    int generatedNumber = random.nextInt(10) + 1; // Generate a number between 1 and 10
   // System.out.println("Debug: Generated number is " + generatedNumber); // Debugging print
    this.number = generatedNumber; // Assign to the field
	
}
 public int describe() {
	 return this.number;
 }
 public String guessNumber(int guess) {
	    if (guess == number) {
	        return "You guessed the number: " + number;
	    } else if (guess < number) {
	        return "Too low! Try again.";
	    } else {
	        return "Too high! Try again.";
	    }
	}
}