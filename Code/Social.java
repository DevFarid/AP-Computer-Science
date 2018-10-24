//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import static java.lang.System.*;

public class Social
{
   public static String go( String a )
	{
		if(a.charAt(3) == '-') {
			if(a.charAt(6) == '-') {
				return a.substring(7);
			}
		}
		return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/