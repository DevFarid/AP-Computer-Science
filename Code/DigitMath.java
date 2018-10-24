//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class DigitMath
{
   public static int countDigits( int number )
	{
		int cnt=0;
		while(number > 0) {
			cnt = cnt + 1;
			number /= 10;
		}		
		return cnt;
	}

	public static int sumDigits( int number )
	{		
		int sum=0;
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static double averageDigits( int number )
	{
		double average= sumDigits(number)/(double)countDigits(number);
		return average;
	}
}