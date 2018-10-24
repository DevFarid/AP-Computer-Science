//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

    public Average()
  	{
  	}
  	public Average(String s)
  	{
  		line=s;
   	}
	public void setLine(String s)
	{
  		line=s;
	}
	public int getCount()
	{
		int count=0;
		Scanner chopper = new Scanner(line);
		while(chopper.hasNextInt())
		{
   			chopper.nextInt();
   			count++;
		}  				
		return count;
	}
	public int getSum()
	{
		int sum=0,num=0;
		Scanner chopper = new Scanner(line);
		while(chopper.hasNextInt())
		{
   			num=chopper.nextInt();
   			sum+=num;
		}  		
		return sum;
	}

	public double getAverage()
	{
		double average=(double)getSum()/getCount();
		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return "average = " + getAverage();
	}
}