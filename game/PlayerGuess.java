import java.util.ArrayList;

public class PlayerGuess {

	RandomWord mysteryWord = new RandomWord();

	// Instances
	static ArrayList<String> letterGuesses;

	// Constructor
	PlayerGuess() {
		letterGuesses = mysteryWord.letterGuesses;
	}
}
