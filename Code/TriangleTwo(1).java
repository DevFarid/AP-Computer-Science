//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
		size=0;
		letter="";
	}
	public TriangleTwo( String let, int sz)
	{
		letter=let;
		size=sz;
	}
	public void setTriangle(int sz, String let)
	{
		letter=let;
		size=sz;
	}
	public String getLetter()
	{
		return "#";
	}
	public String toString()
	{
		String output="";
		for(int i=1;i<=size;i++){
			for(int j=size;j>i; j--) {
				output += letter;
			}
			output = output + "\n";
		}
		out.println(" -");
		return output+"\n";
	}
}