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
	static ArrayList<String> letterTried = new ArrayList<>();
	static String guessLetterString;

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
		if (i == -1) {
			System.out.println("The letter " + guessLetter + " isn't contained in the word");
			return;
		}

		if (letterTried.contains(Character.toString(guessLetter))) {
			System.out.println("The letter " + guessLetter + "has already been enterd before");
			return;
		}

		while (i >= 0) {

			letterTried.add(i, Character.toString(guessLetter)); // adding the letter to the letterTried list

			System.out.println("Letter found at the index : " + i);
			System.out.println("letterGuesses " + letterGuesses);
			System.out.println("letterTried " + letterTried);

			if (!letterGuesses.contains(Character.toString(guessLetter))) {
				letterGuesses.add(i, Character.toString(guessLetter));
			} else {
				letterGuesses.set(i, Character.toString(guessLetter));
			}

			System.out.println("letter to string : " + guessLetter);
			System.out.println("letterGuesses " + letterGuesses);
			System.out.println("letterTried " + letterTried);

			i = word.indexOf(guessLetter, i + 1);

		}
	}
}
