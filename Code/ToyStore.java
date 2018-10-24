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

public class ToyStore
{
	private List<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys(String toys )
	{
		for( String name : toys.split( " " ) )
		{
			Toy t = getThatToy( name );
			if( t == null )
			{
				toyList.add( new Toy( name ) );
			}
			else
			{
				t.setCount( t.getCount() + 1 );
			}
		}
	}
	 
  public Toy getThatToy( String nm )
  {
  	for( Toy t : toyList )
  	{
  		if( t.getName().equals( nm ))
  			 return t;
  	}
  	return null;
  }
  
  public String getMostFrequentToy()
  {
  	String name = "";
  	int max = Integer.MIN_VALUE;
  	for( Toy t : toyList )
  	{
  		if( max < t.getCount() )
  		{
  			max = t.getCount();
  			name = t.getName();
  		}
  	}
  	return name;
  }
  
  public void sortToysByCount()
  {  	
  }
  
	public String toString()
	{
	   return "" + toyList;
	}
}