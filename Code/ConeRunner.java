//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class ConeRunner
{
	public static void main( String[] args )
	{
		System.out.printf( "%.2f\n", Cone.volume( 4, 4) );
		System.out.printf( "%.2f\n", Cone.volume( 4, 3) );
		System.out.printf( "%.2f\n", Cone.volume( 9, 3) );
		System.out.printf( "%.2f\n", Cone.volume( 1, 3) );
		System.out.printf( "%.2f\n", Cone.volume( 1, 5) );
		System.out.printf( "%.2f\n", Cone.volume( 7, 7) );
		System.out.printf( "%.2f\n", Cone.volume( 1.5, 3) );
		System.out.printf( "%.2f\n", Cone.volume( 1.5, 5) );
	}
}

/*

67.02
50.27
254.47
3.14
5.24
359.19
7.07
11.78

*/