//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class OddOrEven
{
	private int number;

	public OddOrEven()
	{
		int number=0;
	}
	public OddOrEven(int num)
	{
		number=num;
	}
	public void setNum(int num)
	{
		number=num;
	}
	public boolean isOdd( )
	{
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(isOdd() == true) {
			return number+ " is even.\n\n"; 
		}
		else {
			return number + " is odd.\n\n";
		}
	}
}