//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int small = Integer.MAX_VALUE;
		int big = Integer.MIN_VALUE;
		
		for(int i=0; i < ray.size(); i++) {
			if(ray.get(i) > big) {
				big = ray.get(i);
			}
			if(ray.get(i) < small) {
				small = ray.get(i);
			}
		}
		
		return (double)(big+small)/2;
	}
}