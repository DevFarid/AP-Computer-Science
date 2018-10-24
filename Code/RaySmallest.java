//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i < ray.length; i++) {
			if(smallest > ray[i]) {
				smallest = ray[i];
			}
		}
		return smallest;			
	}
}