//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		int count = 0;
		for(int x=3; x<=6; x++){
			if(num % x == 1){
				count++;
			}
			if(count==4) {
				return true;
			}
		}
		 return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int coolCount = 0;
		for(int num=6; num <= stop; num++) {
			if(isCoolNumber(num)){
				coolCount++;
			}
		}
		return coolCount;
	}
}