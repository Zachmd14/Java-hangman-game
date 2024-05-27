import java.util.ArrayList;
import java.util.Scanner;

public class PlayerGuess {

	RandomWord mysteryWord = new RandomWord();

	// Instances
	static ArrayList<String> letterGuesses;
	Scanner scan;
	static String guessLine;
	static char guessLetter;

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
}
