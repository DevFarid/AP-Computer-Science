//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int num)
	{
		ArrayList<Integer> fac = new ArrayList<Integer>();
		for(int i=2; i<num; i++)
		{
			if(num % i==0)
				fac.add(i);
		}
		return fac;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> numbs )
	{
		int size = numbs.size()-1;
		while( size >= 0 )
		{
			int item = numbs.get( size );
			ArrayList<Integer> fac = getListOfFactors( item );
			if( fac.size() == 0 )
				numbs.remove( size );
			size--;
		}		
	}
}