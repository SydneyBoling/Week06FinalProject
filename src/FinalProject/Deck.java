package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();

	Deck() {
		// my strings that create a deck of cards
		String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = { " ♥  ", " ♦ ", " ♠  ", " ♣ " };

		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				cards.add(new Card(numberName, suit, count));
				count++;
			}
		}
	}

	public List<Card> getCard() {
		return cards;
	}

	public void setCard(List<Card> card) {
		this.cards = card;
	}
	// this method describes the card when pulled 
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	// this method shuffles the deck and allows the game to play without having the same cards and results
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	// this method allows the player to draw a card to play
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}

}
