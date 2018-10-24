
public class Card {
	private String rank;
	private String suit;
	private int pointValue;

	//creates constructor that takes in rank, suit, and pointvalue
	public Card(String rank, String suit, int pointValue){
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	//returns the rank of the card
	public String getRank(){
		return rank;
	}
	
	//returns the suit of the card
	public String getSuit(){
		return suit;
	}
	
	//returns the pointValue of the card
	public int getPointValue(){
		return pointValue;
	}
	
	//compares current card to another card
	public boolean compare(int pointValue2){
		if(pointValue == pointValue2)
			return true;
		else
			return false;
	}
	
	//returns the properties of the card all as one statement with String value
	@Override
	public String toString(){
		return this.rank + " of " + this.suit + "(point value = " + this.pointValue + ")";
	}
}
