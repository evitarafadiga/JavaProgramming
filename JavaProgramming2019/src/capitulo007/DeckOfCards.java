package capitulo007;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private Card[] deck; //array de objetos Card
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public DeckOfCards() {
		String[] faces = { "As","Dois","Tres","Quatro","Cinco","Seis","Sete",
				"Oito","Nove","Dez","Valete","Dama","Rei"};
		String[] suits = { "Copas","Ouros","Paus","Espadas"};
		
		deck = new Card[NUMBER_OF_CARDS];//cria array de objetos Card
		currentCard = 0; // primeira carta distribuída
		
		//preenche baralho com objetos Card
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count %13],suits[count/13]);
	}
	
	public void shufflle() {
	currentCard = 0;
	
	for (int first = 0; first < deck.length; first++) {
		int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
		
		Card temp = deck[first];
		deck[first] = deck[second];
		deck[second] = temp;
		}
	}
	
	public Card dealCard()
	{
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

}
