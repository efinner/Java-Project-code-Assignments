package TicTacToeWeek6;

import java.util.Scanner;

public class Week06TicTacToeLab {

	public static void main(String[] args) {
		// This Lab requires you to program a simple game of Tic Tac Toe
		//
		// 		 Note:  there are many ways to implement this game.  Use what 
		//		  		you have already learned.  You have the tools to implement
		//		  		this game.  
		//
		// Rules:  
		//		- Tic Tac Toe is a 2-player game played on a 3x3 grid.  
		//
		//		- One player usually plays "X"s and the other player plays "O"s.
		//
		// 		- In our version of the game, "X"s will always start.
		//
		//		- Players will alternate turns.
		//
		// 		- The game will end when one of the conditions is true:
		//				1. A player gets three squares in a row 
		//				2. A player gets three squares in a column
		//				3. A player gets three squares in either diagonal
		//				4. Every square is filled in, but no player has achieved 
		//					conditions 1,2, or 3 as described above --> A Draw!
		//
		//		- A player can win on turn 5, 6, 7, 8, or 9 (start checking for winners on or before turn 5)
		//
		//		- Error checking of input is not necessary here, but will make this game much more
		//				robust.  If you choose to implement this, get the game working first, and then
		//				add a check of the input to make sure that it's an Integer from 1 to 9.
		//
		//		- Use the Scanner to input the users choice of square -- one suggestion is  
		//				to create numbers within the square, and then have the user choose 
		//				that integer (1-9) to choose the location.
		//
		//		- One way to display the game board would be as follows:
		//				+---+---+---+       to		+---+---+---+		+---+---+---+		+---+---+---+
		//				| 1 | 2 | 3 |	   find		|---|---|---|		| | | | | | |		| \ |   | / |
		//				+---+---+---+	   a win	+---+---+---+		+---+---+---+		+---+---+---+
		//				| 4 | 5 | 6 |	-- look-->	|---|---|---|	&	| | | | | | |   & 	|   | X |   |
		//				+---+---+---+	 at these	+---+---+---+		+---+---+---+		+---+---+---+
		//				| 7 | 8 | 9 |	8 patterns	|---|---|---|		| | | | | | |		| / |   | \ |
		//				+---+---+---+		        +---+---+---+		+---+---+---+		+---+---+---+
			
			
		// Start with these steps:
		//
		//		1. Create a class with a main method -- this Lab can be implemented in just one class.
		//				
		//				Alternatively, you could create an object with it's own methods. 
		//				(e.g. GameBoard.java)
		//
		//		2. You will need to declare a gameBoard.  
		//
		//				As shown above, Tic Tac Toe is played on a 3x3 grid that has 9 spaces. 
		//
		//					a. One suggestion is to create an array of length 9 to represent the board:
		//
		//						For example:  String[] gameBoard = new String[9]; 
		//
		//							i. Just remember that arrays are 0 based, so to access the grid, 
		//							the index would go from 0-8.  
		//
		//							ii. Wins can occur in 8 ways (see above).
		//								For example: A horizontal win would be found by 
		//								looking at the contents of: 
		//									gameBoard[0] & gameBoard[1] & gameBoard[2] 
		//									gameBoard[3] & gameBoard[4] & gameBoard[5] 
		//									gameBoard[6] & gameBoard[7] & gameBoard[8] 
		//
		//					b. Another option for the gameBoard would be a 2d array -- This option might be
		//						is a bit more challenging!  
		//
		//						For example:  String[][] gameBoard = new String[3][3];
		//					
		//							i. Just remember that arrays are 0 based, so to access the grid, 
		//							the index would go from 0-2 in two directions.  
		//
		//							ii. Wins can occur in 8 ways.  A horizontal win would be comparing:  
		//									gameBoard[0][0] & gameBoard[0][1] & gameBoard[0][2] 
		// 
		//		3.  Implement the rules as listed above.  
		//
		//		4.  You might want to have the following methods:
		//					a. display() -- to print the gameBoard
		//					b. checkWinStatus() -- to check if a player has won
		//					c. initialize() -- to set up your new gameBoard
		//			
		//		5.  Reminder:  There is no one way to implement this game.
		//		
		//	
		
		// START YOUR IMPLEMENTATION BELOW THIS LINE
		String[] gameBoard = new String[9]; // Initialize the game board array
        initializeGameBoard(gameBoard); // Call method to fill the board with numbers 1-9
        startGame(gameBoard); // Start the main game loop
    }

    // Method to initialize the game board with numbers 1 to 9
    private static void initializeGameBoard(String[] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = String.valueOf(i + 1); // Populate the array with string numbers
        }
    }

    // Displays the current state of the game board
    private static void displayGame(String[] gameBoard) {
        System.out.println("+---+---+---+");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("| " + gameBoard[i] + " "); // Print each board cell
            if ((i + 1) % 3 == 0) { // After every third cell, end the row and print a new line
                System.out.println("|");
                System.out.println("+---+---+---+");
            }
        }
    }

    // Manages the gameplay loop, alternating turns between players, checking for wins or a draw
    private static void startGame(String[] gameBoard) {
        Scanner scanner = new Scanner(System.in); // Scanner for input
        boolean gameRunning = true; // Flag to control the game loop
        char currentPlayer = 'X'; // 'X' starts the game
        int moveCount = 0; // Counter for moves to detect draw condition

        while (gameRunning) {
            displayGame(gameBoard); // Display the board each turn
            if (getPlayerMove(gameBoard, currentPlayer, scanner)) { // Process player move
                moveCount++; // Increment move count
                if (checkWin(gameBoard, currentPlayer)) { // Check for win condition
                    gameRunning = false; // End game if won
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (moveCount == 9) { // Check for draw condition
                    gameRunning = false; // End game if draw
                    System.out.println("The game is a draw!");
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch players
            } else {
                System.out.println("Invalid move, try again."); // Handle invalid moves
            }
        }
        scanner.close(); // Close scanner resource
    }

    // Validates player input and updates the game board
    private static boolean getPlayerMove(String[] gameBoard, char currentPlayer, Scanner scanner) {
        System.out.print("Player " + currentPlayer + ", enter a position (1-9): ");
        int move = scanner.nextInt() - 1; // Adjust for array indexing
        if (move >= 0 && move < 9 && gameBoard[move].equals(String.valueOf(move + 1))) { // Validate move
            gameBoard[move] = String.valueOf(currentPlayer); // Make the move on the board
            return true; // Return true for valid move
        }
        return false; // Return false for invalid move
    }

    // Checks all possible lines (rows, columns, diagonals) for a win
    private static boolean checkWin(String[] gameBoard, char currentPlayer) {
        String playerMark = String.valueOf(currentPlayer); // Convert char to String for comparison
        return (gameBoard[0].equals(playerMark) && gameBoard[1].equals(playerMark) && gameBoard[2].equals(playerMark)) ||
               (gameBoard[3].equals(playerMark) && gameBoard[4].equals(playerMark) && gameBoard[5].equals(playerMark)) ||
               (gameBoard[6].equals(playerMark) && gameBoard[7].equals(playerMark) && gameBoard[8].equals(playerMark)) ||
               (gameBoard[0].equals(playerMark) && gameBoard[3].equals(playerMark) && gameBoard[6].equals(playerMark)) ||
               (gameBoard[1].equals(playerMark) && gameBoard[4].equals(playerMark) && gameBoard[7].equals(playerMark)) ||
               (gameBoard[2].equals(playerMark) && gameBoard[5].equals(playerMark) && gameBoard[8].equals(playerMark)) ||
               (gameBoard[0].equals(playerMark) && gameBoard[4].equals(playerMark) && gameBoard[8].equals(playerMark)) ||
               (gameBoard[2].equals(playerMark) && gameBoard[4].equals(playerMark) && gameBoard[6].equals(playerMark));
    }
}