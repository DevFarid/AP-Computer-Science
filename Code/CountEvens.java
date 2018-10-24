//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class CountEvens
{
   public static int go( int number )
	{
		int even = 0;
		while(number > 0) {
			int last = number % 10;
			if(last % 2 == 0){
				even++;
			}
			number /= 10;
		}
		return even;
	}
} 