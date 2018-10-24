//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t = new Toy( "sorry" );
		System.out.println( t );
		
		t = new Toy( "ji goe" );
		t.setCount( 5 );
		System.out.println( t );
	}
}