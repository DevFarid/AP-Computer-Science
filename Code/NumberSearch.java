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

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		Arrays.sort(numArray);
		for(int item : numArray )
		{
			if(item>searchNum)
			{
				return item;
			}
		}
		return -1;
	}
}