//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ReverseNumber
{
   	private int number;

	public void setNum(int num) {
		number = num;
	}
	
	public int getReverse()
	{	
		int rev=0;	
		int chop=0;
		while (number < 0) {    
		    chop = number % 10;
	    	if (chop % 2 != 0) {     
	        	rev = rev * 10 + chop;
	   		 }
	    	number = number / 10; 
		}		
		return rev;
	}

	public String toString() {
		return number + " reversed is " + getReverse();
	}
	
}