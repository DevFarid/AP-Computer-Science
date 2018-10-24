//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{
		line=s;		
	}
	public void setLine(String s)
	{
		line=s;		
	}
	public int getSum()
	{
		int total = 0;
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			total= total + chop.nextInt();
			
		}
		return total;
	}
	public String getLine()
	{
		return "";
	}
	public String toString()
	{
		return "total = " + getSum();
	}
}