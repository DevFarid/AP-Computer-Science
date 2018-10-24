//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover s = new StringRemover();
		
		s.setRemover("xR-MxR-MHelloxR-M", "R-M");
		out.println(s);
		
		s.setRemover("sxsssxssxsxssexssxsesss", "xs");
		out.println(s);
		
		s.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		out.println(s);
											
	}
}