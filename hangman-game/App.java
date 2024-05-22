/**
 * Main file
 *
 */
public class App {
	public static void main(String[] args) {

		// create the list of word that can be used for the game

		String[] wordList = {
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

		// Create a random int that is containe in [ 0 ; number of words in the list ]
		int randomWord = (int) (Math.random() * wordList.length);

		// Test purpose, print the word, then its length
		System.out.println(wordList[randomWord]);
		System.out.println(wordList[randomWord].length());
		System.out.println();

		// Create wordLenght variable
		int wordLenght = wordList[randomWord].length();

		// Create for loop that will print a '_' for each letter of the randomWord
		for (int i = 0; i <= wordLenght; i++) {

			System.out.print("_ ");

			if (i == wordLenght) {
				System.out.println("");
				break;
			}
		}

	}
}
