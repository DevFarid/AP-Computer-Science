//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   	private int number;
 
	public void setNum(int num) {
		number=num;
	}

	//add a set method

	public boolean isPerfect()
	{
		int s = 0;
		int div = 1;
		while(number > div)	{
			if(number % div == 0) 	{
				s = s + div; 
			}
			div++;
			if(s == number ) {
				return true;
			}
		}	
		return false;
	}

 	public String toString()
 	{
 		if(isPerfect()) {
 			return number + " is perfect.";
 		}
 		return number + " is not perfect.";
	}
	
}