//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TheLine
{
   private String line;

   	public TheLine()
   	{
   		line = "";
   	}
   	public TheLine(String s)
   	{
   		line=s;
  	}
	public int getLargest()
	{
		int num=0;
		Scanner key = new Scanner(line);
		int largest = Integer.MIN_VALUE;
		while(key.hasNextInt()) {
			num = key.nextInt();
			if(num > largest) {
				largest = num;
			}
		}
		return largest;
	}

	public String toString( )
	{
		return line + " - " + " Largest == " + getLargest();
	}
}