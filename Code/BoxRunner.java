//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class BoxRunner
{
   public static void main( String args[] )
   	{
   		Box s = new Box();
   		
   		s.setSize(3);
   		out.println(s);
   		
   		s.setSize(4);
   		out.println(s);
   		
   		s.setSize(5);
   		out.println(s);
   		
   		s.setSize(2);
   		out.println(s);
   		
   		s.setSize(1);
   		out.println(s);
	}
}