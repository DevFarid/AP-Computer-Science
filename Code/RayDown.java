//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int total = numArray[0];
		boolean booleanDown = true;
		for (int counter : numArray) {
			if (counter > total) {
				booleanDown = false;
			}
			total = counter;
	     } 
	    return booleanDown;
	}	
}