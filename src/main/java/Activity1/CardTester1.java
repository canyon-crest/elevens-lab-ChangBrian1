package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card1 = new Card1("jack", "spades", 11);
		Card1 card2 = new Card1("queen", "hearts", 12);
		Card1 card3 = new Card1("king", "diamonds", 13);
		
		card1.suit();
		card1.rank();
		card1.pointValue();
		card1.matches(card2);
		card1.toString();
		
		card2.suit();
		card2.rank();
		card2.pointValue();
		card2.matches(card3);
		card2.toString();
		
		card3.suit();
		card3.rank();
		card3.pointValue();
		card3.matches(card3);
		card3.toString();
	}
}
