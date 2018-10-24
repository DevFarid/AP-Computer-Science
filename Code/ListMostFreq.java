//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( List<Integer> ray )
	{
		int x = 0;
		int y = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i < ray.size(); i++) {
			y = 0;
			for(int j = 0; j < ray.size(); j++) {
				if(ray.get(i).equals(ray.get(j)) && i!=j) {
					y++;
				}
			}
			if(y > max) {
				max = y;
				x = ray.get(i);
			}
		}
		
		return x;
	}
}