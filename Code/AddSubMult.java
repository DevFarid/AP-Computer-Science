//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a > b)
		{
			return a-b;
		}
		
		if(b > a)
		{
			return b-a;
		}
		
		if(a == b)
		{
			return a*b;			
		}
	
		return 0;
	}
}