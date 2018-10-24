//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

// Write a program that will search through a list to find the smallest number and the
//largest number. The program will return the average the largest and smallest numbers. You must combine
//variables, ifs, and a loop to create a working method. There will always be at least one item in the list.

import java.util.Arrays;

public class AverageRunner
{
	public static void main( String args[] )
	{
		ListAverage s = new ListAverage();
		
		System.out.println( s.go( Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345) ) );
		System.out.println( s.go( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println( s.go( Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println( s.go( Arrays.asList(32767)));
		System.out.println( s.go( Arrays.asList(255,255)));
		System.out.println( s.go( Arrays.asList(9,10,-88,100,-555,1000)));
		System.out.println( s.go( Arrays.asList(10,10,10,11,456)));
		System.out.println( s.go( Arrays.asList(-111,1,2,3,9,11,20,30)));
		System.out.println( s.go( Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989)));
		System.out.println( s.go( Arrays.asList(12,15,18,21,23,1000)));
		System.out.println( s.go( Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455)));	
		System.out.println( s.go( Arrays.asList(9,10,-8,10000,-5000,1000)));												
	}
}



/*

6123.0
-44.5
-5884.0
32767.0
255.0
222.5
233.0
-40.5
-490.0
506.0
-102.5
2500.0


*/