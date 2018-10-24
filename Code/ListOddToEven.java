//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = 0;
		int even = 0;
		for(int i=1; i <= ray.size(); i++) {
			if(ray.get(i-1) % 2 == 1) {
				odd = i;
				i = ray.size();
			} 
		}
		if(odd == 0) {
			return -1;
		}
		for(int x=ray.size()-1; x >= 0; x--) {
			if(ray.get(x) % 2 == 0) {
				even = x;
				x = 0;
			}
		}
		return even-(odd-1);
	}
}