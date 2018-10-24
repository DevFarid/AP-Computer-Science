//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;
public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		StringEquality test = new StringEquality();
		
		System.out.println("Enter the first word :: ");
		String one = keyboard.next();
		
		System.out.println("Enter the second word :: ");
		String two = keyboard.next();
		
		test.setWords(one,two);
		out.println(test);

	}
}