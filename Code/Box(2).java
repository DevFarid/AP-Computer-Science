//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Box
{
	private String word;

	public Box()
	{
		String word;
	}
	public Box(String s)
	{
		word=s;
	}
	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for(int i=0; i < word.length(); i++) {
			System.out.println(word);
		}
	}
}