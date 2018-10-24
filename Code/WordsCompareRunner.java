//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare();
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter the first word :: ");
		String one = keyboard.next();
		
		out.println("Enter the second word :: ");
		String two = keyboard.next();		
			
		test.setWords(one,two);
		out.println(test);
	}
}