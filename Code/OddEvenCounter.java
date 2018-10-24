//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

    public OddEvenCounter()
    {
    }
    public OddEvenCounter(String s)
    {
    	line=s;
    }
	public void setLine(String s)
	{
    	line=s;
	}
	public int getEvenCount()
	{
		int count= 0;
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			chop.nextInt();
			if((chop.nextInt() % 2) == 0) {
				count++;
			}
		}
		return count;
	}
	public int getOddCount()
	{
		int count= 0;
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			chop.nextInt();
			if((chop.nextInt() % 1) == 0) {
				count++;
			}
		}
		return count;
	}
	public String toString( )
	{
		return "event count = " + getEvenCount() + "\n" + "odd count = " + getOddCount() + "\n\n";
	}
}