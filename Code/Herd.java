//(c) A+ Computer Science
// www.apluscompsci.com

//array of references as instance variable example

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;

public class Herd
{
	private Creature[] things;

	public Herd()
	{
		things = new Creature[10];		

	}		
	
	public Herd(int size)
	{
		//must size the array	
		things = new Creature[size];
	}	
	
	public void set(int spot, int creatureSize, String name )
	{
		//set spot to new Creature
		things[spot]=new Creature(creatureSize, name);		
	}
	
	public String toString()
	{
		return "" + Arrays.toString( things );
	}
}