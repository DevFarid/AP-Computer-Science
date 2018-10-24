//(c) A+ Computer Science
// www.apluscompsci.com

//array of references herd runner

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdRunner
{
	public static void main ( String[] args )
	{
		Herd bunch = new Herd(5);
		bunch.set(0,3,"Fred");
		bunch.set(1,5,"Barney");
		bunch.set(2,6,"Sally");
		bunch.set(4,12,"Sully");
		System.out.println(bunch);		
  }
}