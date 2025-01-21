package WordGuessingGame;

public class Game {
    protected String wordToGuess; // The word that the player needs to guess
    protected int attempts; // Number of attempts made by the player
    protected char[] revealedLetters; // Array to track revealed letters

    // Constructor to initialize the game with the word to guess

    public Game(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.attempts = 0;
        this.revealedLetters = new char[wordToGuess.length()];
        // Initialize the revealedLetters array with dashes
        for(int i = 0; i < revealedLetters.length; i++) {
            revealedLetters[i] = '-';
        }
    }
    public void playGame() {
        System.out.println("Welcome to the word Guessing Game!");
        System.out.println("You wil be given hints to guess the word");
    }

    // Method to display a basic hint about the word length
    public void displayHint() {
        System.out.println("Hint: The word has " + wordToGuess.length() + " letters.");
    }

    // Method to get the current state of the revealed word
    public String getRevealedWord() {
        return new String(revealedLetters);
    }
}
