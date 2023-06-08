package FinalProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();
		// this runs through the deck and makes the player draw
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		// this initiates the flip and evaluates who wins or loses the round of if it is a draw
		System.out.println("--------------------------------------");
		int draw = 0;
		for (int i = 0; i < 26; i++) {
			Card player1Turn = player1.flip();
			Card player2Turn = player2.flip();
			if (player1Turn.getValue() > player2Turn.getValue()) { 
				System.out.println("--- Hand --- ");
				player1Turn.describe(); 
				System.out.println("---- vs ---- ");
				player2Turn.describe();
				player1.incrementScore();
				System.out.println();
				System.out.println("Player one won this round!");
				System.out.println();
			} else if (player1Turn.getValue() < player2Turn.getValue()) {
				System.out.println("--- Hand --- ");
				player1Turn.describe(); 
				System.out.println("---- vs ---- ");
				player2Turn.describe();
				player2.incrementScore();
				System.out.println();
				System.out.println("Player 2 won this round!");
				System.out.println();
			} else {
				System.out.println("--- Hand --- ");
				player1Turn.describe(); 
				System.out.println("---- vs ---- ");
				player2Turn.describe();
				System.out.println(draw++ + " No one wins this round, it was a draw.");
				System.out.println();
			} 
		}
		// This evaluates the final score and prints out the winner or if it is a draw
		System.out.println("Player 1 score: " + player1.getScore());
		System.out.println("Player 2 score: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins the game!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins the game!");
		} else {
			System.out.println("It is a Draw!");
		}
		System.out.println("--------------------------------------");

		
		
	}

}
