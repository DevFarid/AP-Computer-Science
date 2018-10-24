//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
   public static int go( int number )
	{
		int digit = 0;
		while(number > 0) {
			digit++;
			number /= 10;
		}
		return digit;
	}
}