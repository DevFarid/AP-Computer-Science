//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFourRunner
{
   public static void main( String args[] )
   {
   	TriangleFour s = new TriangleFour();
   	
   	s.setTriangle(3, "R");
    out.println(s);
   	
   	s.setTriangle(4, "B");
    out.println(s);
   	
   	s.setTriangle(5, "X");
    out.println(s);
   	
   	s.setTriangle(2, "E");
    out.println(s);
   	
   	s.setTriangle(1, "T");
    out.println(s);
   }
}