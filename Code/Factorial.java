//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Factorial
{
	private int number;

	public Factorial()
	{
		number=0;
	}
	public Factorial(int num)
	{
		number=num;
	}
	public void setNum(int num)
	{
		number=num;
	}
	public int getNum()
	{
		return number;
	}

	public long getFactorial( )
	{
		long factorial=1;
		for (int loop=1; loop <= number; loop++) {
			factorial = (long)loop * factorial;
		}
		return factorial;
	}

	public String toString()
	{
		return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
	}
}