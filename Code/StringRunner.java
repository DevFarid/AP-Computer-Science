//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner frog = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String s = frog.next();
		
		StringOddOrEven test = new StringOddOrEven();
		
		test.setString(s);
		test.isEven();
		test.toString();
	}
}