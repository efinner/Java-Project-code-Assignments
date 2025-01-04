package GuesstheNumber;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		  // Create a Game object
        Game game = new Game();

        // Print the random number (for testing purposes)
       // System.out.println("Random number (for testing): " + game.describe());

        // Let the user guess
        Scanner scanner = new Scanner(System.in);
        boolean correctGuess = false;

        while (!correctGuess) {
            System.out.print("Enter your guess (1-10): ");
            int guess = scanner.nextInt();

            // Call guessNumber and get the result
            String result = game.guessNumber(guess);
            System.out.println(result);

            // Check if the guess was correct
            if (result.contains("You guessed the number")) {
                correctGuess = true;
            }
        }

        scanner.close();
        System.out.println("Game over!");
    }
}