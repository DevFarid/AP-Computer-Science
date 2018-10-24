//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total=0;
		for(int item : ray) {
			if(item > ray[ray.length-1]) {
				total+=item;
			}
		}
		if(total == 0) {
			return -1;
		}
		
		else {
			return total;
		}
	}
}