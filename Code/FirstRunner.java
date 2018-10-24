//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Enter a word :: ");
		Scanner keyboard = new Scanner(System.in);
		String s = keyboard.next();
		
		FirstAndLast demo = new FirstAndLast(s);
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		
		//add more test cases	
		
	}
}