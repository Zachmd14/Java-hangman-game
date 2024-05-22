/**
 * Main file
 *
 */
public class App {
	public static void main(String[] args) {

		// create the list of word that can be used for the game
		String[] wordList = { "doggo", "pineapple", "table", "history", "poney" };

		// Create a random int that is containe in [ 0 ; number of words in the list ]
		int randomWord = (int) (Math.random() * wordList.length);

		// test purpose, print the lenght of the choosen random word then print the word
		// itself
		System.out.println(wordList[randomWord].length());
		System.out.println(wordList[randomWord]);

	}
}
