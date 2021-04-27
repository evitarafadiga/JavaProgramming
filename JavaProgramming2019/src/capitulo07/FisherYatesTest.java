package capitulo07;

public class FisherYatesTest {
	
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffleFisherYates();
		
		for (int i = 1; i <= 52; i++) {
			
			System.out.printf("%-19s",myDeckOfCards.dealCard());
			
			if (i % 7 == 0)
				System.out.println();
			
		}

	}

}
