//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   	private String line;
	public void setLine(String s) {
   	
   		line=s;
   	
   	}
	private int getLowest()
	{
		int num=0;
		int lowest=Integer.MAX_VALUE;
		Scanner lowScanner = new Scanner(line);
		while(lowScanner.hasNextInt()) {
			num = lowScanner.nextInt();
			if (num < lowest) {
				lowest=num;
			}
		}
		return lowest;
	}

	public double getAverage()
	{
		int count = 0;
		Scanner avg = new Scanner(line);
		double average=0;
		while(avg.hasNextInt()) {
			average+=avg.nextInt();
			count++;
		}
		average = average - getLowest();
		average = average/((double)count-1);
		return average;
	}
	public String toString()
	{
		return "average = " + getAverage();
	}




}