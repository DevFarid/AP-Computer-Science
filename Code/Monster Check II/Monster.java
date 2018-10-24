//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster() {
	
		myWeight=0;
		myHeight=0;
		myAge=0;
	}

	public Monster(int ht) {
		myHeight=ht;
	}

	public Monster(int ht, int wt) {
		myHeight=ht;
		myWeight=wt;
	}

	public Monster(int ht, int wt, int age) {
		myWeight=wt;
		myHeight=ht;
		myAge=age;
	}

	public void setHeight(int ht) {
		myHeight=ht;
	}
	public void setWeight(int wt) {
		myWeight=wt;
	}
	public void setAge(int age) {
		myAge=age;
	}

	public int getHeight() {
		return myHeight;
	}
	public int getWeight() {
		return myWeight;
	}
	public int getAge() {
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		Monster other = (Monster) obj;
		if( obj == null )
			return false;
		return myAge == other.myAge && getHeight()+getWeight() == other.getHeight()+other.getWeight();
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(getHeight() == rhs.getHeight()) {
			if(getWeight() == rhs.getHeight()) {
				if(getAge() == rhs.getAge()) {
					return 0;
				}
			}
		}
		else if(getHeight() > rhs.getHeight()) {
			return 1;
		}
		else if(getHeight() < rhs.getHeight()) {
			return -1;
		}

		return -1;
	}

	public String toString() {
		return getHeight() + " " + getWeight() + " " + getAge();
	}
	
	
}