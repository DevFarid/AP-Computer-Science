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

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] ray = NumberShifter.makeLucky7Array(20);
		System.out.println( Arrays.toString( ray ) );
		NumberShifter.shiftEm( ray );
		System.out.println( Arrays.toString( ray ) );
	}
}



