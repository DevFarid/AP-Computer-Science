//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLenRunner
{
	public static void main( String args[] )
	{
		AvgLen s = new AvgLen();
		
		System.out.println( s.go( "dog", "cats" ) ) ;
		System.out.println( s.go( "aplus", "pigs" ) ) ;
		System.out.println( s.go( "catgiraffe", "apluscompsci" ) ) ;
		System.out.println( s.go( "ap", "aplus" ) ) ;
		System.out.println( s.go( "pluscat", "dogsaplus" ) ) ;
		System.out.println( s.go( "#", "#" ) ) ;
		System.out.println( s.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
		System.out.println( s.go( "code", "code1234" ) ) ;
		System.out.println( s.go( "wow", "eplus" ) ) ;
		System.out.println( s.go( "catsand" , "aplusdogsaplus" ) ) ;
		System.out.println( s.go( "7", "77777" ) ) ;
		
	}
}