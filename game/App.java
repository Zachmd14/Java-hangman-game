public class App {

	public static void main(String[] args) {

		String test;

		RandomWord mysteryWord = new RandomWord();
		PlayerGuess guess = new PlayerGuess();

		System.out.println("\nword = " + mysteryWord.word);
		System.out.println("number of letter in the word = " + mysteryWord.word.length());

		for (String i : guess.letterGuesses) {
			System.out.print(i);
		}
		System.out.println("");

	}
}
