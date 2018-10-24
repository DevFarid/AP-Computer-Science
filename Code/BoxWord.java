//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
		word=s;
	}
	public void setWord(String w)
	{
		word=w;
	}
	public String toString()
	{	
		String output="";
		output += word;
		for(int i=0; i<word.length(); i++) { // amount of rows
			output += word.charAt(i);
			for(int j=1; j>=word.length(); j++) { // first letter of row
				output += " ";
			}
			output += word.charAt(i)+ "\n";			
		}
			StringBuffer rev = new StringBuffer(word);
			output += rev.reverse();		
				
		return output+"\n";
	}
}
//output = ""
//output += word
//
//loop i that runs 
//{
//output += word.charAt(i)
//
//loop j
//{    
//  output += " "
//
//}
//
//output += word.charAt( ______ )+ "\n"
//}
//
//StringBuffer sb = new StringBuffer(word);
//
//output += word backwards