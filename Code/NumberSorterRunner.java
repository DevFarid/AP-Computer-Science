//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class NumberSorterRunner
{
	public static void main(String args[])
	{
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for(int list : cases)
		{
			int[] one = NumberSorter.getSortedDigitArray(list);
			for(int listtwo : one)
			{
				System.out.print(listtwo + " ");
			}
			System.out.println();
		}
	}
}