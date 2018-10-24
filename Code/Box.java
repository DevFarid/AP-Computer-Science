//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Box
{
   private int size;

	public Box()
	{
	}
	public Box(int count)
	{
		size=count;
	}
	public void setSize(int count)
	{
		size=count;
	}
	public int getSize()
	{
		return 0;
	}
	public String toString()
	{
		String output="";
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				output += "*";
			}
			for(int k=size; k>=i; k--) {
				output += "#";
			}
			output += "\n";
		}
		return output;
	}
}