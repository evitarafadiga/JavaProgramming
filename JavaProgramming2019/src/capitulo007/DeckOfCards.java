package capitulo007;

import java.security.SecureRandom;

public class DeckOfCards {

	private Card[] deck; // array de objetos Card
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();

	public DeckOfCards() {
		String[] faces = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete",
				"Dama", "Rei" };
		String[] suits = { "Copas", "Ouros", "Paus", "Espadas" };

		deck = new Card[NUMBER_OF_CARDS];// cria array de objetos Card
		currentCard = 0; // primeira carta distribuida

		// preenche baralho com objetos Card
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}

	public void shuffle() {
		currentCard = 0;

		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	public void shuffleFisherYates() {
		currentCard = 0;

		for (int i = NUMBER_OF_CARDS; i <= deck.length; i--) {
			while (i-- > 0) {
				int j = (int) (Math.random() * (i + 1));

				Card temp = deck[j];
				deck[j] = deck[i];
				deck[i] = temp;
			}

		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

	public void hasEven() {
		currentCard = 0;
		int evens = 0;
		String evenSuit = "";
		String evenFace = "";
		for (int i = 0; i < 5; i++) {
			Card temp = deck[i];
			deck[i] = deck[i + 1];

			if (temp.getSuit() == deck[i].getSuit()) {
				evens++;
				evenSuit = deck[i].getSuit();
			} else if (temp.getFace() == deck[i].getFace()) {
				evens++;
				evenFace = deck[i].getFace();
			} else {
				deck[i + 1] = temp;
			}

		}
		if (evenSuit != "") {
			System.out.printf("\nExiste(m) %d par(es) de: %s", evens, evenSuit);
		}

		if (evenFace != "") {
			System.out.printf("\nExiste(m) %d par(es) de: %s", evens, evenFace);
		}

	}

}
