import java.util.*;

/**
 * Main file
 *
 */
public class App {

	// Declare variables as class-level fields
	static String playerInput;
	static char playerLetter;
	static int i;

	// create the scan method for getting inputs from user
	static Scanner scan = new Scanner(System.in);

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
		int randomWordIndex = (int) (Math.random() * wordList.length);

		/**
		 * 
		 * Test purpose, print the word, then its length
		 *
		 */
		System.out.println(wordList[randomWordIndex]);
		System.out.println(wordList[randomWordIndex].length());
		System.out.println();

		// Create a varibale that contain the word
		String word = wordList[randomWordIndex];

		// Create wordLenght variable
		int wordLenght = wordList[randomWordIndex].length();

		// Create for loop that will print a '_' for each letter of the randomWord
		for (int i = 0; i <= wordLenght; i++) {
			System.out.print("_ ");
			if (i == wordLenght) {
				System.out.println("");
				break;
			}
		}

		// call the askLetter method
		askLetter();

		// call the findLetterPosition method
		findLetterPosition(word, playerLetter);
	}

	/**
	 * Method
	 * ask the player for a letter, then check if its actually one
	 */
	static void askLetter() {

		// ask player for a letter
		System.out.print("Enter your letter : ");
		playerInput = scan.nextLine();
		playerLetter = playerInput.charAt(0);

		System.out.println("Your letter is " + playerLetter);
	}

	/**
	 * Method
	 * check if the playerLetter is contained in the word, if yes, give its index
	 */
	static void findLetterPosition(String word, char playerLetter) {
		System.out.println("Searching for letter: " + playerLetter); // Debugging output
		int i = word.indexOf(playerLetter); // Declare i locally

		while (i >= 0) {
			System.out.println("Letter found at index: " + (i + 1));
			i = word.indexOf(playerLetter, i + 1);
		}
	}

}
