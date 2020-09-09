package capitulo007;

public class Exercicio730 {

	public static void main(String[] args) {

		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();// embaralha cartas

		for (int i = 1; i <= 5; i++) {

			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if (i % 5 == 0)
				System.out.println();

		}
			
		myDeckOfCards.hasEven();
		
	}

}
