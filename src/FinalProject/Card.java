package FinalProject;

public class Card {

		int value;
		String name;
		String suit;
		
		Card(String name, String suit, int value) {
			this.name = name;
			this.suit = suit;
			this.value = value; 

		}
		// this string returns the name
		public String getName() {
			return name;
		}
		// this string sets the name that you return in the above string
		public void setName(String name) {
			this.name =name;
		}
		// this string returns the suit
		public String getSuit() {
			return suit;
		}
		// this string sets the suit of the card and sends the result to the above string to return 
		public void setSuit(String suit) {
			this.suit = suit;
		}
		// this string returns the value
		public int getValue() {
			return value;
		}
		// this string sets the value of the card and sends it to the above string to return
		public void setValue(int value) {
			this.value = value; 
		}
		// this method prints the above information every time the describe method is invoked 
		public void describe() {
			System.out.println(this.name + " of " + this.suit + " : " + this.value);
		}


}





