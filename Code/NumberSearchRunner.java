//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearchRunner
{
	public static void main( String args[] ) throws IOException
	{
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int fnd = 5;
			out.println("Next largest value after " + fnd + " is " + NumberSearch.getNextLargest(array, fnd) + "\n");



			array = new int[]{10, 30, 20, 40, 50, 15};
			fnd = 12;
			out.println("Next largest value after " + fnd + " is " + NumberSearch.getNextLargest(array, fnd) + "\n");



			array = new int[]{3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65};
			fnd = 25;
			out.println("Next largest value after " + fnd + " is " + NumberSearch.getNextLargest(array, fnd) + "\n");



			array = new int[]{100, 110, 1000, 25000, 65535};
			fnd = 32767;
			out.println("Next largest value after " + fnd + " is " + NumberSearch.getNextLargest(array, fnd) + "\n");
	}
}



