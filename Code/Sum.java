//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
	}

	public void sum( )
	{
		sum = (int)one+(double)two;
	}

	public void print( )
	{
		System.out.printf("%.2f\n",sum);
	}
}
