//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
   	private String line;
   	private int breaker;

   	public LineBreaker()
   	{
   		this("",0);
   	}
   	public LineBreaker(String s, int b)
  	{
   		line=s;
   		breaker=b;
   	}
	public void setLineBreaker(String s, int b)
	{
   		line=s;
   		breaker=b;
	}
	public String getLine()
	{
		return "";
	}
	public String getLineBreaker()
	{
		int count = 0;
		String box ="";
		Scanner chop = new Scanner(line);
		while(chop.hasNext()) {
			count++;
			box+=chop.next();
			if(count >= breaker) {
				count = 0;
				box+="\n";
			}
				
		}
		return box;
	}

	public String toString()
	{
		return getLineBreaker();
	}
}