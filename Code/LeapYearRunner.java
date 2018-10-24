//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{ 
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\n Enter a year :: ");
		int year = keyboard.nextInt();
		if ( LeapYear.isLeapYear(year) == true ) {
			System.out.println(year + " is a leap year.");
		}
		else 
		{
			System.out.println(year + " is NOT a leap year.");
		}		
					
	}
}