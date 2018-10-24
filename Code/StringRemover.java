//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
	

	public void setRemover(String s, String rem)
	{
		sentence=s;
		remove=rem;
	}
	public String removeStrings()
	{
		int loc = sentence.indexOf(remove);
		while(loc > -1) {
			sentence = sentence.substring(0, loc-1) + sentence.substring(loc + remove.length());
			loc = sentence.indexOf(remove);
		}
		String cleaned = sentence;
		return cleaned;
	}

	public String toString()
	{
		return removeStrings();
	}
}