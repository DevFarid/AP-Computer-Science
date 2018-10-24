//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		setList("");
	}
	public NumberAnalyzer(String numbers)
	{
		setList(numbers);
	}
	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
		Scanner chopper = new Scanner(numbers);
		while(chopper.hasNext()) {
			list.add(new Number(chopper.nextInt()));
		}
	}
	public int countOdds()
	{
      int oddCount=0;
	  for(int i=0; i < list.size(); i++) {
	  	if(list.get(i).isOdd() == true) {
	  		oddCount++;
	  	}
	  }
      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for(int i=0; i < list.size(); i++) {
      	if(list.get(i).isOdd() == false)
      		evenCount++;
      }
      return evenCount;
	}

	public int countPerfects()
	{
	  int perfectCount = 0;
	  for(int i=0; i < list.size(); i++) {
	  	if(list.get(i).isPerfect() == true) {
	  		perfectCount++;
	  	}
	  }
      return perfectCount;
	}
	
	public String toString( )
	{
		return "";
	}
}