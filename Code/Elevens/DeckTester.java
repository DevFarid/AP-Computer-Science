/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] bob = {"A", "B", "C"};
		String[] suits = {"Fogs", "Bobs"};
		int[] values = {2,1,6};
		Deck deck = new Deck(bob, suits, values);
		System.out.println(deck.toString());
		for(int i = 0; i<5; i++){
			deck.shuffle();
			System.out.println(deck.toString());
		}
	}
}