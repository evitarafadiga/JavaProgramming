package capitulo007;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shufflle();//coloca cartas em ordem
		
		//imprime
		for (int i = 1; i <= 52; i++) {
			
			System.out.printf("%-19s",myDeckOfCards.dealCard());
			
			if (i % 4 == 0)
				System.out.println();
			
		}

	}

}
