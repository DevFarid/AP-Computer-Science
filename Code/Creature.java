//(c) A+ Computer Science
// www.apluscompsci.com

//array of references class example

import static java.lang.System.*;

public class Creature
{
	private int size;
	private String name;
	
	public Creature(int girth, String n) { 
		size=girth; 
		name=n;
	
	}
	
	public void setSize(int girth)
	{
		size=girth;
	}

	
	public boolean equals(Object obj)
	{
		Creature other = (Creature)obj;
		if(size==other.size)
			return true;
		return false;   	
	}
	
	public String toString() 
	{ 
		return name + " " + size; 
	}
}