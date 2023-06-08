package FinalProject;

import java.util.List;
import java.util.ArrayList;

public class Player {

	 List<Card> hands = new ArrayList<Card>();
	 String name;
	 int score;

	public Player() {
		score = 0;

	}

	public Player(String newName) {
		name = newName;
		score = 0;
	}
	// this method describes the card in the hand when its played
	public void describe() {
		for (Card hand : this.hands) {
			hand.describe();
		}
	}
	// this method allows the players to flip their cards so we can evaluate who wins, loses or ties
	public Card flip() {
		return hands.remove(0);
	}
	// this method allows the players to draw a new card from the deck that was shuffled
	public void draw(Deck deck) {
		hands.add(deck.draw());
	}
	// this method is used to add a point to the player that wins the round, if no one wins, no point is given for that round
	public void incrementScore() {
		this.score++;
	}
	// this method is used at the end of the game to evaluate the score and determine the final score and determines who wins
	public int getScore() {
		return score;
	}

}
