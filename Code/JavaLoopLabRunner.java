//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class JavaLoopLabRunner
{
	public static void main( String args[] )
	{
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
		
		//uncomment the class you need to test 
		//as you need to test them
		
		DigitAdder s = new DigitAdder();
		//DigitCounter s = new DigitCounter();
		//DigitMath s = new DigitMath();
		//CountEvens s = new CountEvens();
		//CountOdds s = new CountOdds();
				
			for( int val : cases ) // For Digit Adder remove the // to enable the correct return for DigitAdder 
			{
				System.out.println( s.go( val ) + " is the sum of the digits of " + val );
			}
		
		//	for( int val : cases ) // For Digit Counter remove the // to enable the correct return for DigitCounter
		//	{
		//		System.out.println( val + " contins " + s.go( val ) );
		//	}		
		
		//	for( int val : cases ) // For Digit Math remove //to enable the correct return for DigitMath
		//	{
		//		System.out.println( val + " has a digit average of " + s.averageDigits( val ) );
		//	}			
		
		//	for( int val : cases ) // For Count Evens remove the // to enable the correct return for CountEvens
		//	{
		//		System.out.println( s.go( val ) );
		//	}	
					
		//	for( int val : cases ) // For Count Odds remove the // to enable the correct return for CountOdds
		//	{
		//		System.out.println( s.go( val ) );
		//	}					
		
	}
}