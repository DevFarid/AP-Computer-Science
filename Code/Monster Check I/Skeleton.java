//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{

	private String name;
	private int size;
	
	public Skeleton() {
		name="";
		size=0;
	}
	public Skeleton(String n, int s) {
		name=n;
		size=s;
	}
	
	public String getName() {
		return name;
	}
	public int getHowBig() {
		return size;
	}
	
	public boolean isBigger(Monster other) {
		return getHowBig() > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other) {
		return getHowBig() < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other) {
		return getName().equals(other.getName());
	}
	
	public String toString() {
		return getName() + " " + getHowBig();
	}

}