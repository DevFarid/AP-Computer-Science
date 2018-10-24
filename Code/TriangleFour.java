//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
	}
	public TriangleFour(int count, String let)
	{
	}
	public void setTriangle(int sz, String let)
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
			for(int j=1;j<=i; j++) { // spacing word
				output = output + " ";
			}
			for(int k=size;k>=i; k--) { // repeating word
				output = output + letter;
			}
			output = output + "\n";
		}
		return output+"\n";	
	}
}