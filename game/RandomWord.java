import java.util.ArrayList;

public class RandomWord {

	// Instances
	String word;
	int wordLength;
	int wordIndex;
	ArrayList<String> playerGuess;

	// Constructor
	RandomWord() {
		word = SelectWord();
		wordLength = word.length();
		playerGuess = AddUnderscores(wordLength);
	}

	/**
	 * METHOD
	 * select a random word from a word list
	 */
	String SelectWord() {

		String[] possiblesWords = {
				"doggo", "pineapple", "table", "history", "pony",
				"computer", "keyboard", "chair", "desk", "lamp",
				"book", "pen", "paper", "pencil", "calculator",
				"clock", "calendar", "folder", "monitor", "mouse",
				"headphones", "speaker", "microphone", "tablet", "phone",
				"television", "remote", "couch", "sofa", "rug",
				"curtains", "blinds", "window", "door", "mirror",
				"sink", "toilet", "shower", "bathtub", "towel",
				"soap", "shampoo", "conditioner", "toothbrush", "toothpaste",
				"tissue", "lotion", "comb", "hairbrush", "hairdryer"
		};

		wordIndex = (int) (Math.random() * possiblesWords.length);
		return possiblesWords[wordIndex];
	}

	/**
	 * METHOD
	 * create a list with an '_' for each letter in the word
	 */

	ArrayList<String> AddUnderscores(int wordLength) {
		playerGuess = new ArrayList<String>();

		for (int i = 0; i <= wordLength; i++) {
			playerGuess.add("_");
		}
		return playerGuess;
	}
}
