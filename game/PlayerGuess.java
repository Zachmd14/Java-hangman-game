import java.util.ArrayList;
import java.util.Scanner;

public class PlayerGuess {

	RandomWord mysteryWord = new RandomWord();

	// Instances
	static ArrayList<String> letterGuesses;
	Scanner scan;
	static String guessLine;
	static char guessLetter;
	String word = mysteryWord.word;

	// Constructor
	PlayerGuess() {
		letterGuesses = mysteryWord.letterGuesses;
	}

	void askLetter() {
		scan = new Scanner(System.in);

		System.out.print("Enter yout letter : ");
		guessLine = scan.nextLine();
		guessLetter = guessLine.charAt(0);
	}

	void findLetterIndex(String word, char guessLetter) {
		int i = word.indexOf(guessLetter);

		while (i >= 0) {
			System.out.println("Letter found at the index : " + (i + 1));
			i = word.indexOf(guessLetter, i + 1);
		}
	}
}
