//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
	}
	public String toString( )
	{
		Arrays.sort(wordRay);
		for(int i=0; i < wordRay.length; i++) {
			out.println("word " + i + " :: " + wordRay[i]);
		}
		String output="";
		return output+"\n\n";
	}
}