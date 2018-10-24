//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.*;
import java.io.*; 

public class MatrixSearchRunner
{
    public static void main(String[] args) throws Exception
    {
    	  MatrixSearch ms = new MatrixSearch(40, 40, 15);
          System.out.println( "\n\n" + "Odd count = " + ms.countOdds() );
          System.out.println( "\n" + "Even count = " + ms.countEvens() );
          System.out.println( "\n" + "Prime count = " + ms.countPrimes() );
    }
}
