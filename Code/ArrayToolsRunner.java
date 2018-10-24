//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

public class ArrayToolsRunner
{
	public static void main( String args[] )
	{
	   int[] theRay = {2,4,6,8,10,12,8,16,8,20,8,4,6,2,2};
	   
	   out.println("Original array : "+Arrays.toString(theRay));
	   
	   out.println("Sum of 0-3: "+ArrayTools.sumSection(theRay,0,3));
	   
	   out.println("Count of 2s: "+ArrayTools.countVal(theRay,2));
	   out.println("Count of 8s: "+ArrayTools.countVal(theRay,8));
	   
	   //add more test cases
	   
	   	   
	}
}