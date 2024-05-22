import java.util.*;

/**
 * Main file
 *
 */
public class App {

	// Declare variables as class-level fields
	static String playerLetter;
	static boolean playerLetterOk = false;

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

		// ask the player for a letter using the askLetter method defined under the main
		// method
		askLetter();

		// check if the playerLetter is in the word
		int playerLetterIndex = word.indexOf(playerLetter);
		int truePlayerIndex = playerLetterIndex + 1;

		if (playerLetterIndex != -1) {
			System.out.println("Your letter is in position " + truePlayerIndex + " in the word " + word);
		} else {
			System.out.println("Your letter " + playerLetter + " isn't in the word " + word);
		}

	}

	static void askLetter() {

		while (playerLetterOk != true) {

			// ask player for a letter
			System.out.print("Enter your letter : ");
			playerLetter = scan.nextLine();

			// check if the letter is actually a letter
			playerLetterOk = false;

			if (playerLetter.length() != 1) {
				System.out.println("ERROR : you entered more than one letter");
			} else {
				System.out.println("your letter is " + playerLetter);
				playerLetterOk = true;
			}

		}
	}

}
