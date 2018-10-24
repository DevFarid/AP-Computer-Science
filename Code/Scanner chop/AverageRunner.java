//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
  	 {
  	 	Average portal = new Average();
   		portal.setLine("9 10 5 20");
   		out.println(portal);
   		portal.setLine("11 22 33 44 55 66 77");
   		out.println(portal);
   		portal.setLine("48 52 29 100 50 29");
   		out.println(portal);
   		portal.setLine("0");
   		out.print(portal);
   		portal.setLine("100 90 95 98 100 97");
   		

  	 }
}