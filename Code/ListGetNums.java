//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0; i < ray.size() && numbers.size() < 3; i++) {
			if(ray.get(i) > 11) {
				numbers.add(ray.get(i));
			}
		}
		
			return numbers;
	}
}