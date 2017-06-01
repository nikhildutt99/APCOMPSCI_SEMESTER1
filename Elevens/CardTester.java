/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Ace", "Spades", 1);
		System.out.println("Rank: " + c1.rank() + ", Suit: " + c1.suit() + ", Point Value: " + c1.pointValue());
		System.out.println(c1 + "\n");
		
		Card c2 = new Card("Three", "Diamonds", 3);
		System.out.println("Rank: " + c2.rank() + ", Suit: " + c2.suit() + ", Point Value: " + c2.pointValue());
		System.out.println(c2 + "\n");
		
		Card c3 = new Card("Jack", "Clubs", 11);
		System.out.println("Rank: " + c3.rank() + ", Suit: " + c3.suit() + ", Point Value: " + c3.pointValue());
		System.out.println(c3);
	}
}