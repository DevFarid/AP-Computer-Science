//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class StringUtilities
{
 	public static boolean endsWith(String a, String b)
 	{
 		if ( a.substring(a.length()-b.length()).equals(b) ) {
 			return true;
 		}
		return false;
	}
}