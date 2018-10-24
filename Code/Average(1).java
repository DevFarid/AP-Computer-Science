//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;
   private int num;
   private int sum;
   private int count;

    public Average()
  	{
  	}
  	public Average(String s)
  	{
  		line=s;
  		num = Integer.parseInt(line);
   	}
	public void setLine(String s)
	{
  		line=s;
  		num = Integer.parseInt(line);
	}
	public int getCount()
	{
  		num = Integer.parseInt(line);
		count=count+num;		
		return count;
	}
	public int getSum()
	{
  		num = Integer.parseInt(line);
		sum=sum+num;	
		return sum;
	}

	public double getAverage()
	{
		double average=getSum()+getCount();
		return average;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return "average = " + getAverage();
	}
}