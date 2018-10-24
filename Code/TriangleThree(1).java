//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
	}
	public TriangleThree(int sz, String let)
	{
		size=sz;
		letter=let;
	}
	public void setTriangle( int sz, String let )
	{
		size=sz;
		letter=let;
	}
	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for(int i=1;i<=size;i++){
			for(int j=size;j==1; j--) { // spacing word
				output = output + " ";
			}
			for(int k=1;k<=size; k++) { // repeating word
				output += letter;
			}
			output = output + "\n";
		}
		return output+"\n";	
	}
}