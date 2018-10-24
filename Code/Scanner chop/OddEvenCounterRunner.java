//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   	{
   		OddEvenCounter portal = new OddEvenCounter();
   		
   		portal.setLine("9 10 5 20");	
   		out.println(portal);	
   		
   		portal.setLine("11 22 33 44 55 66 77");	
   		out.println(portal);	
   		
   		portal.setLine("3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6");	
   		out.println(portal);	
   		
   		portal.setLine("2 4 6 8 2 4 6");
   		out.println(portal);		
   		
   		portal.setLine("1 3 5 7 9 1 3 5");
   		out.println(portal);		
  	}
}