//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class DivisorsRunner
{
	public static void main( String args[] )
	{
		int[] cases = {10,45,14,1024,1245,33,65535};
		Divisors s = new Divisors();
	
		for( int val : cases ) // For Digit Adder remove the // to enable the correct return for DigitAdder 
			{
				System.out.println( val + " has divisors of " + s.getDivisors( val ));
			}	
		
	}
}