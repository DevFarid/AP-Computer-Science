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
		int num = 0;
		int even = 0;
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			num = chop.nextInt();
			if(num % 2 == 0) {
				even++;
			}
		}
		return even;
	}
	public int getOddCount()
	{
		int num = 0;
		int odd = 0;
		Scanner chop = new Scanner(line);
		while(chop.hasNextInt()) {
			num = chop.nextInt();
			if(num % 2 == 1) {
				odd++;
			}
		}
		return odd;
	}
	public String toString( )
	{
		return "event count = " + getEvenCount() + "\n" + "odd count = " + getOddCount() + "\n\n";
	}
}