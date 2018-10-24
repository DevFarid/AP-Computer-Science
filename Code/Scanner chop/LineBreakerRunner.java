//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
   		LineBreaker portal = new LineBreaker();
   		
   		portal.setLineBreaker("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9",4);
   		out.println(portal);
   		out.println("\n");
   		
   		portal.setLineBreaker("t h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h",2);
   		out.println(portal);
   		out.println("\n");
   		
   		portal.setLineBreaker("a c o m p u t e r s c i e n c e p r o g r a m",7);
   		out.println(portal);
   		out.println("\n");
   		
   		portal.setLineBreaker("i a m s a m i a m",2);
   		out.println(portal);
   		out.println("\n");
   }
}