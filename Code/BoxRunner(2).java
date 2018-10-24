//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class BoxRunner
{
	public static void main ( String[] args )
	{
		Box portal = new Box();
		
		portal.setWord("hippo");
		portal.print();
		
		portal.setWord("abcd");
		portal.print();
		
		portal.setWord("it");
		portal.print();
		
		portal.setWord("a");
		portal.print();
		
		portal.setWord("chicken");
		portal.print();
	}
}