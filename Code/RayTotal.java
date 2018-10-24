//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		int sum=0;
		for( int item : ray) {
			sum+=item;
		}
		return sum;
	}
}