//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		int div = 0;
		while(number < 0) {
			div++;
			if(number % div == 0) {
				int[] list = {div};
			}
		}
		for( int return : list; )
		{
			String divisors= number + " has divisors of " + return;
			return divisors; 
		}
	}
}