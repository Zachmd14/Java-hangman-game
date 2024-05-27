public class main {

	public static void main(String[] args) {

		// Array of word that can used
		String[] possibleWords = {
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

		// Create a random int wich is contained in [ 0 ; number of words in the list ]
		int randomWordIndex = (int) (Math.random() * possibleWords.length);
		String randomWord = possibleWords[randomWordIndex];

		/**
		 * TEST PURPOSE
		 * print the random word, its index and its length
		 */
		System.out.println("random word : " + randomWord);
		System.out.println("random word length : " + randomWord.length());

	}
}
