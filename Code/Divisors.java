//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		String s = "";
		int div = 1;
		while(number > div)
			{
			if(number % div == 0) 
			{
				s = s +  " " + div; 
			}
			div++;
		}
		return s;
	}
}