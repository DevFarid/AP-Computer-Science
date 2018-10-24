//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.ArrayList;
import static java.lang.System.*;

public class StringSearchRunner
{
	public static void main(String args[])
	{
		System.out.println(StringSearch.countLetters("computerscience", "t"));
		System.out.println(StringSearch.countWords("computerscience", "to"));
		
		out.println("\n");
		
		System.out.println(StringSearch.countLetters("onetwoonetwofun", "n"));
		System.out.println(StringSearch.countWords("onefredonetwodog", "one"));
		
		out.println("\n");
		
		System.out.println(StringSearch.countLetters("odogdogdogdogo", "o"));
		System.out.println(StringSearch.countWords("niininininininininini", "ni"));

		//add more test cases
	}
}