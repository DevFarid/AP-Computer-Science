//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
	}

	public StringRipper(String s)
	{
		word=s;
	}
	
   public void setString(String s)
   {
		word=s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x,y);
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}