public class App {

	public static void main(String[] args) {

		RandomWord mysteryWord = new RandomWord();
		PlayerGuess guess = new PlayerGuess();

		// print the word and it's length
		System.out.println("\nword = " + mysteryWord.word);
		System.out.println("number of letter in the word = " + mysteryWord.word.length());

		// print the underscores : '_'
		for (String i : guess.letterGuesses) {
			System.out.print(i);
		}
		System.out.println("");

		// ask the player the letter he want to check
		guess.askLetter();
		System.out.println("your letter is " + guess.guessLetter); // print the letter the player entered

	}
}
