//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.*;

public class FirstRepeatRunner
{
	public static void main( String args[] )
	{
		First s = new First();
			
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "a")    );
		System.out.println(  s.go(  "aplus")    );
		System.out.println(  s.go(  "01234567890")    );
		System.out.println(  s.go(  "abcdefghijklmnopqrstuvwxyz")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );

	}
}


