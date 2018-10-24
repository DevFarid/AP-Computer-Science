//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class MostFreqRunner
{
	public static void main( String args[] )
	{
		ListMostFreq s = new ListMostFreq();
		
		System.out.println(  s.go( Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5) ) );
		System.out.println(  s.go( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99) ) );
		System.out.println(  s.go( Arrays.asList(10,20,30,40,50,10,10,40,30,20,10) ) );
		System.out.println(  s.go( Arrays.asList(32767) ) );
		System.out.println(  s.go( Arrays.asList(255,255) ));
		System.out.println(  s.go( Arrays.asList(9,10,-88,100,-555,1000) ) );
		System.out.println(  s.go( Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2) ) );
		System.out.println(  s.go( Arrays.asList(-111,1,2,3,9,11,20,30) ) );
		System.out.println(  s.go( Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989) ) );
		System.out.println(  s.go( Arrays.asList(12,12,15,18,21,23,1000) ) );
		System.out.println(  s.go( Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1) ) );	
		System.out.println(  s.go( Arrays.asList(9,10,-8,10000,-5000,1000) ) );		
		System.out.println( s.go( Arrays.asList( -200, 222, 222, 50, 50, 9, 50, 50 ) ) );
		System.out.println( s.go( Arrays.asList( 50000, 50000, 50000, 50000, -99 ) ) );									
	}
}



/*

5
10
10
32767
255
9
2
-111
9
12
13
9
50
50000


*/