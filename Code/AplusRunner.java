//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -  

public class AplusRunner
{
	public static int check( int x )
	{
		if(x % 5 == 0){
			return 1;
		}
		else if(x % 4 == 0) {
			return 2;
		}
		else if(x % 3 == 0){
			return 3;
		}
		return 0;
	}
	public static void main( String args[] )
	{
		//test cases - client code
		System.out.println( check( 100 ) );
		System.out.println( check( 200 ) );
		System.out.println( check( 25 ) );
		System.out.println( check( 88 ) );
		System.out.println( check( 99 ) );	
		System.out.println( check( 7 ) );
		System.out.println( check( 8 ) );
		System.out.println( check( 10 ) );					
	}
}