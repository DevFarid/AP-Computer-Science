	//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;
	int count;

	public Prime()
	{
		number=0;
	}
	public Prime(int num)
	{
		number=num;
	}
	public void setPrime(int num)
	{
		number=num;
	}
	public boolean isPrime()
	{
	 int count = 0;
	 for(int loop=2; loop < number; loop++) {
	 	if((number % loop) == 0)
	 		count++;	
	 }
		if(count < 1) {
	 		return true;
	 	}	 
		return false;
	}

	public String toString()
	{
		if(isPrime()) {
			return number + " is a prime.";
		}
			return number + " is NOT a prime.";
	}
}