package WordGuessingGame;

import java.util.Scanner;

public class InputGame  extends Game{
    protected Scanner scanner;

    // Constructor to initialize the InputGame with the word to guess
    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void playGame() {
        super.playGame();
        String userGuess = ""; // Variable to store the player's guess
        while(!userGuess.equalsIgnoreCase(wordToGuess)) {
            displayHint(); // Display the current hint
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextLine(); // Read the player's guess
            attempts++; // Increment the attempt counter
            if(userGuess.equalsIgnoreCase(wordToGuess)) {
                // if the guess is correct, congratulate the player
                System.out.println("Congratulations! You've guessed the" +
                        "word in " + attempts + " attempts.");
            }else {
                // if the guess is incorrect, prompt to try again
                System.out.println("Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord());
            }
        }
    }
}
