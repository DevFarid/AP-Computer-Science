//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7,28,496,1111,199,201,17};
		for( int num : nums )
		{
			Number one = new Number( num );
			out.println( one.isOdd() ? one + " is odd.\n" : one + " is not odd.\n" );
			out.println( one.isPerfect() ? one + " is perfect.\n" : one + " is not perfect.\n" );
		}
	}
}