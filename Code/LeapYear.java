//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{	
	public static boolean isLeapYear( int year )
	{
		if (year % 4 == 0)
		{
			return true;
		}
		return false;
	}
}