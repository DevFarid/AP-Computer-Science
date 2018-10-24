//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover s = new LetterRemover();
		
		s.setRemover("I am Sam I am", 'a');
		out.println(s);		
		
		s.setRemover("ssssssssxssssesssssesss", 's');
		out.println(s);		
		
		s.setRemover("qwertyqwertyqwerty", 'a');
		out.println(s);			
		
		s.setRemover("abababababa", 'b');
		out.println(s);		
		
		s.setRemover("abaababababa", 'x');
		out.println(s);	
											
	}
}