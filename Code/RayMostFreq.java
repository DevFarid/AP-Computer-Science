//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayMostFreq
{
	//method go will return the valueue 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int value = 0;
		int max = Integer.MIN_VALUE;
		int count = 0;
		for( int i = 0; i < ray.length; i++ )
		{ 
			count = 0;
			for( int j = 0; j < ray.length; j++)
			{
				if( ray[i] == ray[j] && i!=j )
					count++;
			}
			if( count > max  )
			{
				max = count;
				value = ray[i];
			}
		}			
		return value;
	}
}