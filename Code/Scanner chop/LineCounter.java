//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
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
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			chop.nextInt();
			count++;
		}	
		return count;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return "count = " + getCount();
	}
}