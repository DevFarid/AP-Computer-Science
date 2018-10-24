//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class CountOdds
{
   public static int go( int number )
	{
		int odd = 0;
		while(number > 0) {
			int last = number % 10;
			if(last % 2 == 1){
				odd++;
			}
			number /= 10;
		}
		return odd;
	}
}