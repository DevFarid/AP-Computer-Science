//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters= new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot]=m;
		//put m in the Monster array at [spot]
	}

	public Monster getLargest( )
	{
		Monster big = myMonsters[0];
		for(int i=1; i < myMonsters.length; i++) {
			if(!big.isBigger(myMonsters[i])) {
				big = myMonsters[i];
			}
		}
		return big;
	}

	public Monster getSmallest( )
	{
		Monster small = myMonsters[0];
		for(int i=1; i < myMonsters.length; i++) {
			if(small.isBigger(myMonsters[i])) {
				small = myMonsters[i];
			}
		}
		return small;
	}

	public String toString()
	{
		return " " + Arrays.toString(myMonsters);
	}
}