public class Main {

	public static void main(String[] args) {

		RandomWord mysteryWord = new RandomWord();

		System.out.println("word = " + mysteryWord.word);
		System.out.println("number of letter in the word = " + mysteryWord.wordLength);

		for (String i : mysteryWord.playerGuess) {
			System.out.print(i);
		}
		System.out.println("");

	}
}
