//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int loc = sentence.indexOf(lookFor);
		while(loc > -1) {
			sentence = sentence.substring(0, sentence.indexOf(lookFor)) + sentence.substring(loc + 1);
			loc = sentence.indexOf(lookFor);
		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " equals " + removeLetters();
	}
}