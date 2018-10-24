//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort portal = new WordSort("abc ABC 12321 fred alexander");
		out.println(portal);
		
		WordSort portal2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		out.println(portal2);
		
		WordSort portal3 = new WordSort("b x 4 r s y $");
		out.println(portal3);
		
		WordSort portal4 = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		out.println(portal4);
	}
}