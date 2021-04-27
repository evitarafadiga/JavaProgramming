package capitulo07;

public class Card {
	
	private final String face;
	private final String suit;

	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	public String toString() {
		return face + " de " + suit;
	}

	public String getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}

}
