//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int sum= 0;
		for(int item : ray) {
			sum+= item;
		}
		return sum;
	}
}