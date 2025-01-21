package WordGuessingGame;

import java.util.Random;

public class WordGuessingGame {
    public static void main(String[] args) {
        // Define a pool of words to choose from
        String[] wordPool = {"Inheritance", "polymorphism", "encapsulation",
                "abstraction", "interface"};
        Random random = new Random();
        // Randomly select a word from the pool
        String wordToGuess = wordPool[random.nextInt(wordPool.length)];
        AdvancedGame game = new AdvancedGame(wordToGuess); // Create an instance of AdvancedGame
        game.playGame(); // Start the game
    }
}
